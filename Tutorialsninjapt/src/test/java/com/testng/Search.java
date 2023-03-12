package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialningha.base.Baseclass;

import pageclasses.SearchPage;

public class Search extends Baseclass{
	

	WebDriver driver;
	
	
@BeforeMethod
public void Setup()
{   LoadPropertiesFile();
 	driver=initializeBrowserAndOpenApplication(prop.getProperty("browserName"));
}
  @AfterMethod
  public void TearDown()
{
 driver.quit();	
}
    @Test(priority=1)
    public void verifySearchWithValidProduct()
     {
	  SearchPage searchpage=new SearchPage(driver);
	  searchpage.enterProductInSearchbox(dataprop.getProperty("validproduct"));
      searchpage.ClickOnSearchbutton();

      Assert.assertTrue(searchpage.getProductDisplayMsg(),"product is not display");
     }
  
    @Test(priority=2)
    public void verifySearchWithInValidProduct()
    {
	 SearchPage searchpage=new SearchPage(driver);
	  searchpage.enterProductInSearchbox(dataprop.getProperty("invalidproduct"));
     searchpage.ClickOnSearchbutton();

     String actmsg=searchpage.getNoProductMsg();
     Assert.assertEquals(actmsg,"There is no product that matches the search criteria.","product is not exist");
     }

   @Test(priority=3)
   public void verifySearchWithOUTProductName()
   {    
	SearchPage searchpage=new SearchPage(driver);
    searchpage.enterProductInSearchbox("");
    searchpage.ClickOnSearchbutton();

     String actmsg=searchpage.getNoProductMsg();
     Assert.assertEquals(actmsg,"There is no product that matches the search criteria.","product is not exist");
}
}
