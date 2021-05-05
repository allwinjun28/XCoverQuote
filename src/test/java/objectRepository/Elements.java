package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
	
	WebDriver driver;
	
	public Elements(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	@FindBy(css="#nav-get-quote-button")
	WebElement QuoteButton;
	
	@FindBy(css=".col-6.col-sm-4")
	List<WebElement> insuranceType;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	@FindBy(css="#rcc-confirm-button")
	WebElement cookieAcceptButton;
	
	@FindBy(css="#geosuggest__input")
	WebElement addressInput;
	
	@FindBy(css=".geosuggest__item")
	List<WebElement> addressSuggestions;
	
	@FindBy(xpath="//input[@name=\"brand\"]")
	WebElement productDetailsInput;
	
	@FindBy(xpath="//input[@name=\"description\"]")
	WebElement productDescriptionInput;
	
	@FindBy(xpath="//input[@name=\"retail_value\"]")
	WebElement productValue;
	
	@FindBy(css=".react-select__indicator.react-select__dropdown-indicator.css-tlfecz-indicatorContainer")
	WebElement ownerDropdown;
	
	@FindBy(css=".DateInput.DateInput_1")
	WebElement dateBox;
	
	
	
	
	
	public WebElement getAQuoteButton()
	{
		return QuoteButton;
	}
	
	public List<WebElement> getinsuranceType()
	{
		return insuranceType;
	}
	public WebElement getNextButton()
	{
		return nextButton;
	}
	public WebElement getCookieButton()
	{
		return cookieAcceptButton;
	}
	public WebElement getAddressInput()
	{
		return addressInput;
	}
	public List<WebElement> getaddressSuggestions()
	{
		return addressSuggestions;
	}
	public WebElement getproductDetailsInput()
	{
		return productDetailsInput;
	}
	
	public WebElement getproductDescriptionInput()
	{
		return productDescriptionInput;
	}
	
	public WebElement getproductValue()
	{
		return productValue;
	}
	public WebElement getownerDropdown()
	{
		return ownerDropdown;
	}
	
	public WebElement getdateBox()
	{
		return dateBox;
	}

}
