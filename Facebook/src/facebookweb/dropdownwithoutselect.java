package facebookweb;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownwithoutselect {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();	 
		 // driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		  
		  
		  driver.get("https://wwww.facebook.com/");
		  
		  WebElement createacc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  createacc.click();
		  
		  
		  WebElement firstnm=driver.findElement(By.xpath("//input[@name='firstname']"));
		  firstnm.sendKeys("raj");
		  
		  WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("chavan");
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		  email.sendKeys("raj@gmail.com");
		  WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		  password.sendKeys("123@456");
		  WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		   Select s=new Select(day);
		   s.selectByIndex(24);
		  Thread.sleep(10);
		List<WebElement> opt=driver.findElements(By.xpath("//select[@aria-label='Month']//option"));
		//int j=opt.size();
		for(int i=0;i<opt.size();i++)
		{
			if(opt.get(i).getText().equals("oct"))
					{
				     opt.get(i).click();
				
				break;
					}
			
		}
		
	

}
}