package selenium11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metod {
 public static void main(String args[])throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://wwww.facebook.com/");
	  Thread.sleep(30);
	  
	  driver.navigate().to("https://www.selenium.dev/");
	  //Thread.sleep(30);
	/* driver.navigate().back();
	 Thread.sleep(30);
	 driver.navigate().forward();
	 Thread.sleep(30);
	 
	 driver.navigate().refresh();
	 driver.quit();*/
	  
 }
 }