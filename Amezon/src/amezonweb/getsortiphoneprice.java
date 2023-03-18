package amezonweb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsortiphoneprice {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
	    searchbox.sendKeys("iphone12");
	    WebElement searchicon=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
	    searchicon.click();
	    Thread.sleep(2000);//span[@class='a-price-whole']
	    List<WebElement> iphone_price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    for(int i=0;i<iphone_price.size();i++)
	    {
	    	String price=iphone_price.get(i).getText();
	    	System.out.println(price);
	    }	
	String iphone[]={"54,499","57,999","53,900","54,499","60,990","65,899",
			         "66,498","72,989","69,998","60,990","6,199","49,900",
		             "72,989","74,900","60,990","55,990","2,999"};
	Arrays.sort(iphone);
	System.out.println(Arrays.toString(iphone));
	

}
}
