package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAddressPage {

WebDriver driver;
	

	public SelectAddressPage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(css="#geosuggest__input")
	WebElement addressInput;
	
	@FindBy(css=".geosuggest__item")
	List<WebElement> addressSuggestions;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	public void selectAAddressFromSuggestion()
	{
		addressInput.sendKeys("George street");
		
		int addressSuggestionsCount=addressSuggestions.size();
		
		if(addressSuggestionsCount>0)
		{
			addressSuggestions.get(0).click();			
		}
		String selectedAddress=addressInput.getAttribute("value");
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}
}
