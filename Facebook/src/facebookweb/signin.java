package facebookweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signin {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");
		  Thread.sleep(1000);
		  WebElement createacc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  createacc.click();
		  Thread.sleep(2000);
		  
		  WebElement firstnm=driver.findElement(By.xpath("//input[@name='firstname']"));
		  Thread.sleep(2000);
		  firstnm.sendKeys("raj");
		  
		  WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("chavan");
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		  email.sendKeys("raj@gmail.com");
		  WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		  password.sendKeys("123@456");
		  Thread.sleep(2000);
		
		  WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		   Select s=new Select(day);
		   s.selectByIndex(24);
		   
		 
		   WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		   Select m=new Select(month);
		   m.selectByValue("6");
		 
		   WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		   Select y=new Select(year);
		   y.selectByVisibleText("2020");
			  
			  Thread.sleep(30);
			  WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
			  boolean result=custom.isSelected();
			  if(result==true)
			  {
				  System.out.println(result);
				  System.out.println("Element is selected");
				  
			  }
			  else
			  {
				  System.out.println(result);
				  System.out.println("Element is not selected"); 
				  custom.click();
			  }
			  
			  result=custom.isSelected();
			  System.out.println(result);
	
	WebElement pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	boolean result1=pronoun.isDisplayed();
	if(result1==true)
	{
		System.out.println(result1);
		System.out.println("element is displayed");
		
	}
	else
	{
		System.out.println(result1);
		System.out.println("element is not displayed");
		custom.click();
	}
	System.out.println("=======");
	result1=pronoun.isDisplayed();
	System.out.println(result1);
	WebElement signup=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
	signup.click();
	}
	
}
