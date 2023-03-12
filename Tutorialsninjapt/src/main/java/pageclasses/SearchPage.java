package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	@FindBy(linkText="HP LP3065")
	private WebElement productDisplayMsg;
	@FindBy(xpath="(//div[@class='row'])[2]//p[text()='There is no product that matches the search criteria.']")
	private WebElement NoProductMsg;

	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterProductInSearchbox(String productnm)
	{
		searchbox.sendKeys(productnm);
	}
	public void ClickOnSearchbutton()
	{
		searchButton.click();
	}
	public boolean getProductDisplayMsg()
	{
		boolean isDisplay=productDisplayMsg.isDisplayed();
		return isDisplay;
	}
	public String getNoProductMsg()
	{
		String productText=NoProductMsg.getText();
		return productText;
	}
	
}
