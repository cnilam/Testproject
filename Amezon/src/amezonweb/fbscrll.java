package amezonweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbscrll {
public static void main(String args[])
{
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");	
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 //driver.manage().timeouts().implicitlyWait(durationOf.SECONDS(10));
 driver.get("https://www.firstcry.com");
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,500)");
 //js.executeScript("window.scrollBy(0,-200)");
 //js.executeScript("window.scrollBy(300,0)");
 //WebElement button=driver.findElement(By.xpath("//div[@class='footer_kid_store sprite_footer_bg']"));
 //js.executeScript("arguments[0].scrollIntoView(true)",button);
// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 WebElement login=driver.findElement(By.xpath("//span[@class='anch poplogin_main poplogin R12_61']"));
 js.executeScript("click();",login);
}
}
