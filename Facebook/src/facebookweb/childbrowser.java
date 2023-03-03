package facebookweb;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");
		  WebElement instagram=driver.findElement(By.xpath("//a[text()='Instagram']"));
		  
		  instagram.click();
		  Thread.sleep(3000);
		ArrayList<String> add1=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(add1.get(1));
		Thread.sleep(3000);
		 WebElement usernm=driver.findElement(By.xpath("//input[@type='text']"));
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		
		 
		 usernm.sendKeys("cnilam");
		 password.sendKeys("12345");
		 Thread.sleep(1000);
		 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		 login.submit();
		 
	}

}
