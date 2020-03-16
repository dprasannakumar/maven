package prasanna2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestmaven {
	String xf,sh;
	@BeforeTest
    public  void  mAIN() throws IOException, InterruptedException
    {
    	System.setProperty("WebDriver.Chrome.Driver","/home/prasannakumar/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		     driver.get("https://accounts.google.com/");
		
           FileInputStream fil = new FileInputStream("/home/prasannakumar/Downloads/saliniumtest/seliniumloginfile2 .xlsx");
		XSSFWorkbook xf= new XSSFWorkbook(fil);
           XSSFSheet sh = xf.getSheetAt(0);
           
          for(int i=1;i<=sh.getLastRowNum();i++)
          {
        	 
           String username =String.valueOf( sh.getRow(i).getCell(0).getStringCellValue());                 
              System.out.println(username);
              Thread.sleep(500);
             String password = sh.getRow(i).getCell(1).getStringCellValue();
             System.out.println(password);

              Thread.sleep(1000);
              driver.findElement(By.id("identifierId")).sendKeys(username);
              driver.findElement(By.xpath("(//span[@class=\"RveJvd snByac\"])[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[1]")).sendKeys(password);
              driver.findElement(By.xpath("(//span[@class=\"RveJvd snByac\"])[1]")).click();
              
              System.out.println("Login  Done Successfully....");
              break;
          }
	}
 
@Test
  public void f() {
	        System.out.println("it is empty");
  }
}
