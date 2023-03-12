package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialningha.base.Baseclass;
import com.tutorialninja.utils.Utilities;

import pageclasses.HomePage;
import pageclasses.RegisterPage;

public class Register extends Baseclass{

WebDriver driver;
Baseclass b=new Baseclass();
@BeforeMethod
public void Setup()
{   
	LoadPropertiesFile();
	driver=initializeBrowserAndOpenApplication(prop.getProperty("browserName"));
	HomePage homepage=new HomePage(driver);
	homepage.ClickOnAccount();
	homepage.ClickOnRegister();
	 
	
}
@AfterMethod
public void Teardown()
{
	driver.quit();
}
	@Test(priority=1)
	public void verifyRegisterbyMandatoryfields()
	{   
		RegisterPage registerpage=new RegisterPage(driver);
	    registerpage.EnterFirstname(dataprop.getProperty("firstname"));
	    registerpage.EnterLastname(dataprop.getProperty("lastname"));
	    registerpage.EnterEmail(Utilities.generateEmailTimestamp());
	    registerpage.EnterTelephone(dataprop.getProperty("telno"));
	    registerpage.EnterPassword(prop.getProperty("password"));
	    registerpage.EnterConfirmPassword(prop.getProperty("password"));
	    registerpage.SelectAgree();
	    registerpage.ClickOnRegisterButton();
		
 		String Actualsucessmsg=registerpage.getCreateAccMsg();
 		Assert.assertEquals(Actualsucessmsg,dataprop.getProperty("accountCreatedWarning"),"Account sucesspage is not displayed");
 		
	}
	@Test(priority=2)
	public void verifyRegisterWithAllfields()
	{
		RegisterPage registerpage=new RegisterPage(driver);
	    registerpage.EnterFirstname(dataprop.getProperty("firstname"));
	    registerpage.EnterLastname(dataprop.getProperty("lastname"));
	    registerpage.EnterEmail(Utilities.generateEmailTimestamp());
	    registerpage.EnterTelephone(dataprop.getProperty("telno"));
	    registerpage.EnterPassword(prop.getProperty("password"));
	    registerpage.EnterConfirmPassword(prop.getProperty("password"));
	    registerpage.ClickOnNewsletter();
	 	registerpage.SelectAgree();
		registerpage.ClickOnRegisterButton();
			
		String Actualsucessmsg=registerpage.getCreateAccMsg();
		Assert.assertEquals(Actualsucessmsg,dataprop.getProperty("accountCreatedWarning"),"Account sucesspage is not displayed");
}
	@Test(priority=3)
	public void verifyAccountwithExistingEmailAddress()
	{
		RegisterPage registerpage=new RegisterPage(driver);
	    registerpage.EnterFirstname(dataprop.getProperty("firstname"));
	    registerpage.EnterLastname(dataprop.getProperty("lastname"));
	    registerpage.EnterEmail(prop.getProperty("Email"));
	    registerpage.EnterTelephone(dataprop.getProperty("telno"));
	    registerpage.EnterPassword(prop.getProperty("password"));
	    registerpage.EnterConfirmPassword(prop.getProperty("password"));
	    registerpage.ClickOnNewsletter();
	 	registerpage.SelectAgree();
		registerpage.ClickOnRegisterButton();
		
	    String Actualsucessmsg=registerpage.getEmailAlreadyRegistermsg();
		Assert.assertEquals(Actualsucessmsg,"Warning: E-Mail Address is already registered!","warning msg is not displayed");
		
    }
	@Test
	public void verifyAccountWithoutFillingAnyDetails()
	{
		RegisterPage registerpage=new RegisterPage(driver);
	    registerpage.EnterFirstname("");
	    registerpage.EnterLastname("");
	    registerpage.EnterEmail("");
	    registerpage.EnterTelephone("");
	    registerpage.EnterPassword("");
	    registerpage.EnterConfirmPassword("");
	    registerpage.ClickOnRegisterButton();
		
		String Actualsucessmsg=registerpage.getprivacyPolicyWarningmsg();
		Assert.assertTrue(Actualsucessmsg.contains(dataprop.getProperty("privacyPolicyWarning")),"warning msg is not displayed");
		
		String Firstnmwarning=registerpage.getFirstnameWarningMsg();
		Assert.assertEquals(Firstnmwarning,dataprop.getProperty("firstNameWarning"), "Warning not matched");
		
		String Lastnmwarning=registerpage.getLastnameWarning();
		Assert.assertEquals(Lastnmwarning,dataprop.getProperty("lastNameWarning"), "Warning not matched");
	
		String Emailwarning=registerpage.getEmailWarningMsg();
		Assert.assertEquals(Emailwarning,dataprop.getProperty("emailWarning"), "Warning not matched");
	
		String Telephonewarning=registerpage.getTelephoneWarningMsg();
		Assert.assertEquals(Telephonewarning, dataprop.getProperty("telephWarning"), "Warning not matched");
		
		String Passwordwarning=registerpage.getPasswordWarningMsg();
		Assert.assertEquals(Passwordwarning, dataprop.getProperty("passwordWarning"), "Warning not matched");
	}
	
	}


