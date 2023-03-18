package amezonweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyproduct {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	
	WebElement bestseller=driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	bestseller.click();
	WebElement selectbag=driver.findElement(By.xpath("//a[text()='Bags, Wallets and Luggage']"));
	selectbag.click();
	WebElement kidsbag=driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[16]"));

	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)",kidsbag);
	kidsbag.click();
	Thread.sleep(2000);
	WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
  addtocart.click();
  Thread.sleep(2000);
  WebElement proceedtobuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
  proceedtobuy.click();
  

	}

}
