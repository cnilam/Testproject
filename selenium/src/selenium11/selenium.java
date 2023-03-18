package selenium11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
  public static void main(String args[]) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  Thread.sleep(30);
	  
	  driver.get("https://wwww.facebook.com/");
	  
	  String url=driver.getCurrentUrl();  
	  System.out.println(url);
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  driver.close();
	 // driver.quit();
  }
}
