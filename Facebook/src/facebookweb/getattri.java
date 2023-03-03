package facebookweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattri {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");
		  WebElement createacc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  createacc.click();
		  Thread.sleep(2000);
		  
		  WebElement firstnm=driver.findElement(By.xpath("//input[@name='firstname']"));
		  String attributevale=firstnm.getAttribute("aria-label");
		  System.out.println(attributevale);
		//  WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		  String attributevale1=firstnm.getAttribute("type");
		  System.out.println(attributevale1);
		  
		  
		  String tagnm=firstnm.getTagName();
		  System.out.println(tagnm);
		 
		 String text=createacc.getText();
		 System.out.println(text);
		
	}

}
