package facebookweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
/*public static void main(String args[])
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver ();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("webdriver manager");
driver.findElement(By.xpath("//ul[@class='G43f7e']//li[3]")).click();
}*/
	public static void main(String args[])
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver ();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	driver.get("https://www.amezon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirt");
	driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[2]")).click();
}
}