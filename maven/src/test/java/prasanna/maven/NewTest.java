package prasanna.maven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	String act ;
	String tt;
	String ext ="Sign in – Google accounts";
	@BeforeTest
	public void B() throws InterruptedException
	{
		System.setProperty("WebDriver.Chrome.Driver","/home/prasannakumar/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		  Thread.sleep(2000);
		  act= driver.getTitle();
		  System.out.println(act);
		    if(ext.equalsIgnoreCase(act))
		  {
		 	System.out.println("both are equal");
			
		 }
		   else
		   {
			   driver.quit();
		   }
		    Thread.sleep(2000);
		      driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("prasannakumar.dubba@gmail.com");
			  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
			  Thread.sleep(1000);
		      driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[1]")).sendKeys("8660323727");
			  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
			  tt = driver.getTitle();
			   System.out.println(tt);
			 
	}       
	
  @Test
  public void f() throws InterruptedException {
	

	   if(tt.equalsIgnoreCase(act))
	   {
		   System.out.println("test is failed");
	   }
	   else 
	   {
		   System.out.println("tes case is passed");
	   }
      
  }
  @AfterTest
  public void G()
  {
	System.out.println("testing completed");
  }
       
}
