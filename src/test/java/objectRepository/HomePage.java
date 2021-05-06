package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	@FindBy(css="#nav-get-quote-button")
	WebElement QuoteButton;
		
	@FindBy(css="#rcc-confirm-button")
	WebElement cookieAcceptButton;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	

	public void clickOnGetAQuote()
	{
		QuoteButton.click();
	}
	
	public void acceptCookies()
	{
		cookieAcceptButton.click();
	}	
	
	
	public void clickOnNext()
	{
		nextButton.click();
	}
	
	

}
