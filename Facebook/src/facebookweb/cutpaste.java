package facebookweb;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cutpaste {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium2\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/campaign/landing.php/");
		  WebElement firstnm=driver.findElement(By.xpath("//input[@name='firstname']"));
		  firstnm.sendKeys("chavan");
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  firstnm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		  
		 Actions act=new Actions(driver);
		 //swelect name enter into firstnm
		 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//cut that name
		 act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		 act.keyDown(Keys.TAB).build().perform();
		 //paste it
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
