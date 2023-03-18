package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public static void main(String args[])throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
		  WebElement search=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		  search.sendKeys("iphone");
		  WebElement search_button= driver.findElement(By.className("L0Z3Pu"));
		  search_button.click();
		  
		  WebElement ph_nm=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']"));
		  ph_nm.click();
		  
		  WebElement Addtocart= driver.findElement(By.xpath("//button[text()='GO TO CART']"));
		  Addtocart.click();
		 
	}
}
