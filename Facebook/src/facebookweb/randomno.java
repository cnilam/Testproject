package facebookweb;

import java.io.File;
import java.io.IOException;

import java.util.Calendar;
import java.util.Date;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class randomno {
	public static void main(String args[]) throws InterruptedException, IOException
    
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(30);
		  
		  driver.get("https://www.facebook.com/");
		  TakesScreenshot t=(TakesScreenshot)driver;
		  for(int i=0;i<5;i++)
		  {
			// Random random = new Random();   
			// Generates random integers 0 to 49  
			//int x = random.nextInt(50); 
			 // int a = ThreadLocalRandom.current().nextInt();   
			    
			  // Print random integer values  
			  File src= t.getScreenshotAs(OutputType.FILE);
			  Calendar calendar = Calendar.getInstance();  
			   System.out.print("At present Date And Time Is: " + calendar.getTime());  
			   Date s=calendar.getTime();
			     
        
		 
		 Thread.sleep(2000);
		 File dest=new File("C:\\Users\\Pankaj\\Documents\\automation\\screenshot\\test"+  s +".jpeg");
				FileHandler.copy(src, dest);
		  }
	}


}
