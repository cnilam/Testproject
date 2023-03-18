package selenium11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
     public static void main(String args[]) throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  Thread.sleep(30);
		  
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		  submitbutton.click();
		  Thread.sleep(3000);
		  Alert alt=driver.switchTo().alert();
		 // driver.switchTo().alert().accept();
		  //driver.switchTo().alert().dismiss(); 
		  driver.switchTo().alert().getText();
          String s=alt.getText();
          System.out.println(s); 
     }
}