package amezonweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltoview {

	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(3000);
		  
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(1000);
		
	}
}
