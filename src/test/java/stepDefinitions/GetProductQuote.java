package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.Elements;
import resources.Utils;

public class GetProductQuote extends Utils {
	
	@Given("I launch the website")
	public void i_launch_the_website() {
	   
		openBrowser();
		driver.get("https://www.xcover.com/"); 
		el.getCookieButton().click();

	}

	@When("Click on Get A Quote")
	public void click_on_get_a_quote() {
		
		el.getAQuoteButton().click();	
		
		
		
		//driver.close();	    
	}
	
	@Given("I select the insurance type")
	public void i_select_the_insurance_type() {
	   
		int insureTypeCount=el.getinsuranceType().size();
		System.out.println(insureTypeCount);
		
		for(int i=0;i<insureTypeCount;i++)
		{
			String typeName=el.getinsuranceType().get(i).getText();
			//if(typeName.contains(""))
		}
		if(insureTypeCount>0) {
			el.getinsuranceType().get(2).click();		
		}
		
		el.getNextButton().click();
	}

	@Given("I select the address from suggestions")
	public void i_select_the_address_from_suggestions() {
	    
		el.getAddressInput().sendKeys("George street");
		
		int addressSuggestionsCount=el.getaddressSuggestions().size();
		
		if(addressSuggestionsCount>0)
		{
			el.getaddressSuggestions().get(0).click();
			
		}
		String selectedAddress=el.getAddressInput().getAttribute("value");
		System.out.println(selectedAddress);
		el.getNextButton().click();
	}

	@Given("I enter the product details")
	public void i_enter_the_product_details() {
		el.getproductDetailsInput().sendKeys("Fridge");
		
		String enteredProductDetails=el.getproductDetailsInput().getAttribute("value");
		System.out.println(enteredProductDetails);

		el.getNextButton().click();
	}

	@Given("I enter the product description")
	public void i_enter_the_product_description() {

		   el.getproductDescriptionInput().sendKeys("Double door fridge");
			
			String enteredProductDescription=el.getproductDescriptionInput().getAttribute("value");
			System.out.println(enteredProductDescription);

			el.getNextButton().click();
	}
	@Given("I enter the product value")
	public void i_enter_the_product_value() {
		el.getproductValue().sendKeys("500");
		
		String enteredProductValue=el.getproductValue().getAttribute("value");
		System.out.println(enteredProductValue);

		el.getNextButton().click();
	}

	@Given("I select a date from calendar")
	public void i_select_a_date_from_calendar() {
		el.getdateBox().click();
		
		String month="Jan";
		int date=20;
		
		for(int i=0; i<12; i++)
		{
			String currentMonthWithYear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"CalendarMonth CalendarMonth_1\" and @data-visible='true']/div/strong"))).getText();
			if(currentMonthWithYear.contains(month))
			{
				String dateXpath ="//*[@class='CalendarMonth CalendarMonth_1' and @data-visible='true']//tr/td[.='"+date+"']";
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateXpath))).click();
				break;
			}
			else {
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".DayPickerNavigation_leftButton__horizontalDefault"))).click();  //.DayPickerNavigation_leftButton__horizontalDefault)
			}
		}
		
		
//		List<WebElement> Month=driver.findElements(By.xpath("//*[@class=\"CalendarMonth_caption CalendarMonth_caption_1\"]/strong"));
//		System.out.println(Month.size());
//		String monthval=Month.get(1).getText();
//		System.out.println("Month = " +monthval);
		//driver.findElement(By.xpath("//td[@tabindex=\"0\"]")).click();
		el.getNextButton().click();
	}

	@Given("I select the product condition")
	public void i_select_the_product_condition() {
		el.getownerDropdown().click();
		
		driver.findElement(By.xpath("//div[@id='react-select-2-option-1']")).click();
		el.getNextButton().click();
	}

	@Given("Validate the quote page")
	public void validate_the_quote_page() {
	    
	}

}
