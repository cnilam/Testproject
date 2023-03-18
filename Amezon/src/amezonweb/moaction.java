package amezonweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moaction {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(3000);
		  
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(1000);
		  WebElement listaccount=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		  WebElement yourorder=driver.findElement(By.xpath("//span[text()='Your Orders']"));
		  Actions act=new Actions(driver);
		  act.moveToElement(listaccount).moveToElement(yourorder).click().build().perform();
	}

}
