
package facebookweb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String args[]) throws InterruptedException, IOException
     
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(30);
		  
		  driver.get("https://www.facebook.com/");
		  TakesScreenshot t=(TakesScreenshot)driver;
		  for(int i=0;i<=5;i++)
		  {
		 File src= t.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\Pankaj\\Documents\\automation\\screenshot\\sc1"+ i +".jpeg");
				 
	    FileHandler.copy(src, dest);
		  }
	}
}


