package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage {
WebDriver driver;
	
	public ProductDescriptionPage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"description\"]")
	WebElement productDescriptionInput;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	
	public void enterProductDescription()
	{
		productDescriptionInput.sendKeys("Double door fridge");
		
		String enteredProductDescription=productDescriptionInput.getAttribute("value");		
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}

}
