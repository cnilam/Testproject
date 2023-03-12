package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy (xpath="//span[text()='My Account']")
    private WebElement Accountdropdown;
	
	@FindBy (linkText="Login")
    private WebElement Login;
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
  public HomePage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, HomePage.class);
  }
  public void ClickOnAccount()
  {
	  Accountdropdown.click();
  }
  public void ClickOnLogin()
  {
	  Login.click();
  }
  public void ClickOnRegister()
  {
	  Register.click();
  }

  }
