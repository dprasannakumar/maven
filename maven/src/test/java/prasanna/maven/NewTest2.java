package prasanna.maven;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.mongodb.MapReduceCommand.OutputType;

public class NewTest2 {
	String y;
	String yy;
	public WebDriver d;
	@BeforeTest
	public void B() throws InterruptedException, IOException
	{
    	System.setProperty("WebDriver.Chrome.Driver","/home/prasannakumar/Downloads/chromedriver_linux64/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test");
		Thread.sleep(1000);
		y = d.getTitle();
		System.out.println(y);
		WebElement date = d.findElement(By.name("bdaytime"));
		date.sendKeys("27112019");
		date.sendKeys(Keys.TAB);
		date.sendKeys("0950");
		d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		TakesScreenshot ts = ((TakesScreenshot)d);
		File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		
		//FileUtils.co(source, new File("/home/prasannakumar/Downloads/screenshotss/error.png"));
		//org.apache.commons.io.FileUtils.copyFile(source, new File("/home/prasannakumar/Downloads/screenshotss/error.png"));
		 yy = d.getTitle();
		 System.out.println(yy);
		 
	}
  @Test(priority=0)
  public void TEst2() {
	 // yy = d.getTitle();
	 // System.out.println(yy);
	  if(y.equalsIgnoreCase(yy))
	  {
		 System.out.println("test passed");
	  }
	  else
	  {
		  System.out.println("test is failed");
	  }
  }
		    @Test(priority=6)
		    public void c_method(){
		    System.out.println("I'm in method C");
		    }
		    @Test(priority=9)
		    public void b_method(){
		    System.out.println("I'm in method B");
		    }
		    @Test(priority=1)
		    public void a_method(){
		    System.out.println("I'm in method A");
		    }
		    @Test(priority=0)
		    public void e_method(){
		    System.out.println("I'm in method E");
		    }
		    @Test(priority=3)
		    public void d_method() {
		    	int i=0;
		    	if(i==0)
		    	{
		    		
		    	}
		    System.out.println("I'm in method D");
		    }

		
  }

