package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import resources.Utils;

public class SelectProductBuyDatePAge extends Utils {

WebDriver driver;
	
	public SelectProductBuyDatePAge(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css=".DateInput.DateInput_1")
	WebElement dateBox;
		
	
	@FindBy(xpath="//*[@class=\"CalendarMonth CalendarMonth_1\" and @data-visible='true']/div/strong")
	WebElement currentVisibleMonth;
	
	@FindBy(css=".DayPickerNavigation_leftButton__horizontalDefault")
	WebElement backButton;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	public void selectDateBox()
	{
		
		dateBox.click();
				
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}

}
