package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorialningha.base.Baseclass;
import com.tutorialninja.utils.Utilities;

import pageclasses.AccountPage;
import pageclasses.HomePage;
import pageclasses.LoginPage;

public class Login extends Baseclass{
	
	 WebDriver driver;
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
    @BeforeMethod
    public void setUp()
    {    LoadPropertiesFile();
         HomePage homepage=new HomePage(driver);
    	 driver=initializeBrowserAndOpenApplication(prop.getProperty("browserName"));
    	 homepage.ClickOnAccount();
 		 homepage.ClickOnLogin();
 		
    }
	@Test(priority=1,dataProvider="test1data")
	public void LoginFunctionalityWithValidCredentials(String email,String password)
	{   
		 LoginPage loginpage=new LoginPage(driver);
		 AccountPage accpage=new AccountPage(driver);
	     loginpage.EnterEmail(email);
	     loginpage.EnterPassword(password);
	     loginpage.ClickOnLoginButton(); 
		 
		Assert.assertTrue(accpage.getDisplayStatusofEditingAccInfo(),"Edit your account info is not displayed");
		 
	}
	@DataProvider(name="test1data")
	public Object[][] supplyTestdata()
	{
		Object [][] data=Utilities.getTestdata("Loginsheet");
		return data;
	} 
	@Test(priority=2)
	public void LoginFuntionalityWithInvalidCredentials()
	{
		LoginPage loginpage=new LoginPage(driver);
        loginpage.EnterEmail(Utilities.generateEmailTimestamp());
        loginpage.EnterPassword(dataprop.getProperty("invalidPassword"));
        loginpage.ClickOnLoginButton();
        
		String actualmsg=loginpage.getEmilpasswordNomatchinginfo();
		String expmsg=dataprop.getProperty("emialpasswordNomatchwarning");
		Assert.assertTrue(actualmsg.contains(expmsg), "expected warning msg is not displayed");
		
	
	}
	@Test(priority=3)
	public void LoginWithInvalidmailAndValidpassword()
	{    
		LoginPage loginpage=new LoginPage(driver);
        loginpage.EnterEmail(Utilities.generateEmailTimestamp());
        loginpage.EnterPassword(prop.getProperty("password"));
        loginpage.ClickOnLoginButton();
    
        String actualmsg=loginpage.getEmilpasswordNomatchinginfo();
		String expmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualmsg.contains(expmsg), "expected warning msg is not displayed");
		
	}
	@Test(priority=4)
	public void LoginWithValidemailAndInvalidpassword()
	{
		LoginPage loginpage=new LoginPage(driver);
        loginpage.EnterEmail(prop.getProperty("Email"));
        loginpage.EnterPassword(dataprop.getProperty("invalidPassword"));
        loginpage.ClickOnLoginButton();
    
        String actualmsg=loginpage.getEmilpasswordNomatchinginfo();
		String expmsg=dataprop.getProperty("emialpasswordNomatchwarning");
		Assert.assertTrue(actualmsg.contains(expmsg), "expected warning msg is not displayed");
		
	}
	@Test(priority=5)
	public void LoginWithoutProvidingCredentials()
	{
		LoginPage loginpage=new LoginPage(driver);
        loginpage.EnterEmail("");
        loginpage.EnterPassword("");
        loginpage.ClickOnLoginButton();

        String actualmsg=loginpage.getEmilpasswordNomatchinginfo();
		String expmsg=dataprop.getProperty("emialpasswordNomatchwarning");
		Assert.assertTrue(actualmsg.contains(expmsg), "expected warning msg is not displayed");
		

	}
	

}
