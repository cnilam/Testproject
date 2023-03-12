package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	WebDriver driver;
	
	@FindBy (id="input-email")
	private WebElement email;
	@FindBy (id="input-password")
	private WebElement password;
	@FindBy (xpath="//input[@type='submit']")
	private WebElement Loginbutton; 
    @FindBy (linkText="Edit your account information")
    private WebElement EditAccInfo;
	@FindBy (xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement EmailpasswordNotmatchingoption;
    
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmail(String emailId)
	{
		email.sendKeys(emailId);
	}
	
	public void EnterPassword(String pwd)
	{
		email.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton()
	{
		Loginbutton.click();
	}
	public String getEmilpasswordNomatchinginfo()
	{
		String Text=EmailpasswordNotmatchingoption.getText();
		return Text;
	}
}
