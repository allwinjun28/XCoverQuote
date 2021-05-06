package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ProductDetailsPage {
	
WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"brand\"]")
	WebElement productDetailsInput;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	public void enterProductDetails()
	{
		String productValueToEnter="Fridge";
		productDetailsInput.sendKeys(productValueToEnter);
		
		String enteredProductDetails=productDetailsInput.getAttribute("value");
		Assert.assertEquals(productValueToEnter, enteredProductDetails);

	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}

}
