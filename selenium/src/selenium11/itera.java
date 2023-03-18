package selenium11;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itera {
     public static void main(String args[]) throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
   	  WebDriver driver= new ChromeDriver();
   	  
   	  Thread.sleep(30);
   	  
   	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
   	  WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
   	  name.sendKeys("Nilamphalke");
   	  WebElement mobile_no=driver.findElement(By.xpath("//input[@id='phone']"));
  	  mobile_no.sendKeys("9978675643");
  	  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
  	  email.sendKeys("cnilam@gmail.com");
  	  WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
  	  password.sendKeys("Nilam@phalke");
  	  WebElement address=driver.findElement(By.xpath("//textarea[@id='address']"));
 	  address.sendKeys("grace home,manjari,mundhava road");
 	  WebElement submit=driver.findElement(By.xpath("//button[@name='submit']"));
 	  submit.click();
 	
 	
   	  
     }
}
