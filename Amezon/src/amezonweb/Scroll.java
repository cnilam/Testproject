package amezonweb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(3000);
		  
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(1000);
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  js.executeScript("window.scrollBy(0,-200)");
	}

}
