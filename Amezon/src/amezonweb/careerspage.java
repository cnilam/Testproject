package amezonweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class careerspage {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement career=driver.findElement(By.xpath("//a[text()='Careers']"));
		career.click();
		
		WebElement jobtitle=driver.findElement(By.xpath("(//input[@id='search_typeahead'])[1]"));
		jobtitle.sendKeys("software developer");
		WebElement location=driver.findElement(By.xpath("(//input[@id='search_typeahead'])[2]"));
		jobtitle.sendKeys("spain");
	
		
		WebElement searchbutton=driver.findElement(By.xpath("//button[@id='search-button']"));
		searchbutton.click();
		
		
		
		
		
		
	}

}
