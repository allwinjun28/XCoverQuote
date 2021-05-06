package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductConditionPage {
	
WebDriver driver;
	
	public ProductConditionPage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css=".react-select__indicator.react-select__dropdown-indicator.css-tlfecz-indicatorContainer")
	WebElement productCondition;
	
	@FindBy(xpath="//div[@id='react-select-2-option-1']")
	WebElement usedOption;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	public void selectProductCondition()
	{
		
		productCondition.click();
		
		usedOption.click();
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}

}
