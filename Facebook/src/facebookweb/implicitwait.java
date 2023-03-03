package facebookweb;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));//4.0.0
	   // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//3.141.59
	    driver.get("https://wwww.facebook.com/");
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20));
	  WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text")));
	 user.sendKeys("nilam");
	 WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password")));
	 password.sendKeys("7890");
	 driver.findElement(By.xpath("//button[@name='login']"));
	}
	
	

}
