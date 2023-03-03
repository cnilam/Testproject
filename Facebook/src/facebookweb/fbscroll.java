package facebookweb;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbscroll {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");
		  Thread.sleep(1000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript(document.getElementBy.xpath("//input[@type='text']"));
		  WebElement usernm=driver.findElement(By.xpath("//input[@type='text']"));
			usernm.sendKeys("nilam.chavan90@yahoo.com");
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("pankaj1989");
			WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
			login.click();
			Thread.sleep(4000);
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,3000)");
			 Thread.sleep(3000);
			 js.executeScript("window.scrollBy(0,-500)");	
			 Thread.sleep(1000);
			 js.executeScript("window.scrollBy(2000,0)");
			 Thread.sleep(1000);
			 js.executeScript("window.scrollBy(-1000,0)");
	}

}
