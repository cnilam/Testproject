package facebookweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String args[])throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");
		 
	/*	WebElement usernm=driver.findElement(By.xpath("//input[@type='text']"));
		usernm.sendKeys("nilamchavan90@yahoo.com");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("pankaj");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		Thread.sleep(3000);*/
		
		
	}

}

