package com.tutorialningha.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.tutorialninja.utils.Utilities;

public class Baseclass {
	 static WebDriver driver;
	 public static Properties prop; 
	public static Properties dataprop;
	public void LoadPropertiesFile()
	{
		 prop=new Properties();
		 File propFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialninja\\config\\config.properties");
         dataprop=new Properties();
         File datapropFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialsninja\\testdata\\testdata.properties");
		
         
		try
		{
			FileInputStream fd = new FileInputStream(datapropFile);
			dataprop.load(fd);
			
		} 
		catch (FileNotFoundException e1)
		{
			
			e1.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
         
         try
         {
			
			FileInputStream fs = new FileInputStream(propFile);
			prop.load(fs);
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
 public WebDriver initializeBrowserAndOpenApplication(String browserName)
 {
	 
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\workspace\\selenium2\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIME,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	 
 }
}
