package facebookweb;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addofbrowser {
	public static void main(String args[]) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium\\chromejar\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  Thread.sleep(30);
		  
		  driver.get("https://wwww.facebook.com/");

		  Thread.sleep(3000);
	  WebElement metapay=driver.findElement(By.xpath("//a[text()='Meta Pay']"));
	  
	  WebElement messanger=driver.findElement(By.xpath("//a[text()='Messenger']"));
	 
	  metapay.click();
	  Thread.sleep(3000);
	  
	  messanger.click();
	  
	  Thread.sleep(2000);
		
	//  WebElement metapay=driver.findElement(By.xpath("//a[text()='Meta Pay']"));
	 //  metapay.click();
	 // Thread.sleep(3000);
	//  String mainbrowser=driver.getWindowHandle();
	//	System.out.println(mainbrowser);   
		//address of main browser
		
	
	
  //    Set<String> addr=driver.getWindowHandles();
      ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());//addrof main & child browser
    
      String a1=addr1.get(0);
      String a2=addr1.get(1);
      String a3=addr1.get(2); 
     // String a4=addr1.get(3);
     
      System.out.println(a1);
      System.out.println(a2);
     System.out.println(a3);
     // System.out.println(a4);
    
      driver.switchTo().window(a1);
      Thread.sleep(3000);
      System.out.println(driver.getCurrentUrl());
      
      driver.switchTo().window(a2);
      Thread.sleep(3000);
      System.out.println(driver.getCurrentUrl());
    
      driver.switchTo().window(a3);
      Thread.sleep(3000);
      System.out.println(driver.getCurrentUrl());
     
     
      
}
}