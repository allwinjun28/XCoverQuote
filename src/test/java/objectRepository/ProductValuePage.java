package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValuePage {
WebDriver driver;
	
	public ProductValuePage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"retail_value\"]")
	WebElement productValue;
		
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	public void enterProductValue()
	{
		
		productValue.sendKeys("500");		
		String enteredProductValue=productValue.getAttribute("value");
		
	}

	
	public void clickOnNext()
	{
		nextButton.click();
	}

}

