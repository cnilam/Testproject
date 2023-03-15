package iteraweb;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	 public static void main(String args[]) throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
   	  WebDriver driver= new ChromeDriver();
   	  
   	 // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   	  
   	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
   	List<WebElement> opt=driver.findElements(By.xpath("//select[@class='custom-select']//option"));
//int s=opt.size();
   	for(int i=0;i<opt.size();i++)
   	{
   		if(opt.get(i).getText().equals("Italy"))
   			
   		{
   			opt.get(i).click();
   			break;
   		}
   	}
   /*	WebElement radiobutton1=driver.findElement(By.xpath("//input[@id='female']"));
	WebElement radiobutton2=driver.findElement(By.xpath("//input[@id='male']"));
	WebElement radiobutton3=driver.findElement(By.xpath("//input[@id='other']"));

   	radiobutton1.click();
   	radiobutton2.click();
   	radiobutton3.click();*/
   	
     }
}