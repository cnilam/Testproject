package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
 WebDriver driver;
	@FindBy (id="input-firstname")
	private WebElement firstname;
	@FindBy (id="input-lastname")
	private WebElement lastname;
	@FindBy (id="input-email")
	private WebElement email;
	@FindBy (id="input-firstname")
	private WebElement telephone;
	@FindBy (id="input-password")
	private WebElement password;
	@FindBy (id="input-confirm")
	private WebElement confirm;
	@FindBy  (name="agree")
	private WebElement agree;
	@FindBy  (xpath="//input[@type='submit']")
	private WebElement registerbutton;
	@FindBy (xpath="//div[@id='content']//h1")
	private WebElement CreateAccMsg;
	@FindBy (xpath="//input[@name='newsletter'][@value='1']")
	private WebElement newsletter;
	@FindBy (xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement emailAlreadyRegisterMsg;
	@FindBy (xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement privacyPolicyWarningMsg;
	@FindBy (xpath="//div[text()='First Name must be between 1 and 32 characters!']")
	private WebElement firstnameWarning ;
	@FindBy (xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastnameWarning;
	@FindBy (xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailWarning ;
	@FindBy (xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWarning ;
	@FindBy (xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWarning;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void EnterFirstname(String fname)
	{
		firstname.sendKeys(fname);
	}

	public void EnterLastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void EnterEmail(String emaill)
	{
		email.sendKeys(emaill);
	}

	public void EnterTelephone(String telno)
	{
		telephone.sendKeys(telno);
	}
	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void EnterConfirmPassword(String conpwd)
	{
		confirm.sendKeys(conpwd);
	}
	public void SelectAgree()
	{
		agree.click();
	}

	public void ClickOnRegisterButton()
	{
		registerbutton.click();
	}
	public String getCreateAccMsg()
	{
		String createAccmsg=CreateAccMsg.getText();
		return createAccmsg;
	}
	public void ClickOnNewsletter()
	{
		newsletter.click();
	}
	public String getEmailAlreadyRegistermsg()
	{
		String emailMsg=emailAlreadyRegisterMsg.getText();
		return emailMsg;
	}
	public String getprivacyPolicyWarningmsg()
	{
		String privacypolicyMsg=privacyPolicyWarningMsg.getText();
		return privacypolicyMsg ;
	}
	public String getFirstnameWarningMsg()
	{
		String fnmWarning =firstnameWarning.getText();
		return fnmWarning ;
	}
	public String getLastnameWarning()
	{
		String lnmWarning=lastnameWarning.getText();
		return lnmWarning ;
	}
	public String getEmailWarningMsg()
	{
		String emailWarn=emailWarning.getText();
		return  emailWarn;
	}
	public String getTelephoneWarningMsg()
	{
		String telWarning=telephoneWarning.getText();
		return  telWarning;
	}
	public String getPasswordWarningMsg()
	{
		String pwdWarning=passwordWarning.getText();
		return pwdWarning ;
	}
}
