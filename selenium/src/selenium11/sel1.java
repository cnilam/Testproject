package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {
	public static void main(String args[]) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium2\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.mycarhelpline.com/");
		 
		  //driver.findElement(By.xpath("//div[@id='topnav']//ul[@class='nav menu mod-list']//li[@class='item-72']//a")).click();
		
		   driver.findElement(By.xpath("//div[@id='bluemenu']/child::ul[1]/child::li[5]/child::a[1]")).click();
	driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[@class='innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[1]")).click();
		  /*  Dimension d=new Dimension(300,500);
		  driver.manage().window().setSize(d);
		  Thread.sleep(3000);
		  Point p=new Point(200,400);
		  driver.manage().window().setPosition(p);
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.manage().window().minimize();
		 // driver.close();
		  driver.quit();*/
		
	}

}
