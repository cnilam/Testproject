package amezonweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginpage {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
WebElement signup=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));

Thread.sleep(2000);
WebElement starthere=driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
Actions act=new Actions(driver);
act.moveToElement(signup).moveToElement(starthere).click().build().perform();
Thread.sleep(2000);

WebElement name=driver.findElement(By.xpath("//input[@type='text']"));
name.sendKeys("Nilam");
WebElement mobileno=driver.findElement(By.xpath("//input[@type='tel']"));
mobileno.sendKeys("9975729631");
WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("cnilam37@gmail.com");
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("12345");
WebElement openacc=driver.findElement(By.xpath("//input[@type='submit']"));
openacc.click();
Thread.sleep(2000);
}
}
