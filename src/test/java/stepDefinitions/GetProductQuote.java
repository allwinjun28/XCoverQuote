package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.HomePage;
import objectRepository.InsuranceTypePage;
import objectRepository.ProductConditionPage;
import objectRepository.ProductDescriptionPage;
import objectRepository.ProductDetailsPage;
import objectRepository.ProductValuePage;
import objectRepository.SelectAddressPage;
import objectRepository.SelectProductBuyDatePAge;
import resources.Utils;

public class GetProductQuote extends Utils {
	 HomePage homePage;
	 InsuranceTypePage insurnaceTypePage;
	 SelectAddressPage selectAddressPage;
	 ProductDetailsPage productDetailsPage;
	 ProductDescriptionPage productDescriptionPage;
	 ProductValuePage productValuePage;
	 SelectProductBuyDatePAge selectProductBuyDatePAge;
	 ProductConditionPage productConditionPage;
	 
	 
	@Given("I launch the website")
	public void i_launch_the_website() {
	   
		 openBrowser();
		 driver.get("https://www.xcover.com/"); 
		 homePage=new HomePage(driver);
         homePage.acceptCookies();
	}

	@When("Click on Get A Quote")
	public void click_on_get_a_quote() {
		
		homePage.clickOnGetAQuote();				 
	}
	
	@Given("I select the insurance type")
	public void i_select_the_insurance_type() {
		
		insurnaceTypePage=new InsuranceTypePage(driver);
	   
		insurnaceTypePage.selectAInsuranceType();
		insurnaceTypePage.clickOnNext();
	}

	@Given("I select the address from suggestions")
	public void i_select_the_address_from_suggestions() {
	    
		selectAddressPage=new SelectAddressPage(driver);
		selectAddressPage.selectAAddressFromSuggestion();
		selectAddressPage.clickOnNext();
	}

	@Given("I enter the product details")
	public void i_enter_the_product_details() {
		productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.enterProductDetails();
		productDetailsPage.clickOnNext();
	}

	@Given("I enter the product description")
	public void i_enter_the_product_description() {
		productDescriptionPage=new ProductDescriptionPage(driver);
		productDescriptionPage.enterProductDescription();
		productDescriptionPage.clickOnNext();
		   
	}
	@Given("I enter the product value")
	public void i_enter_the_product_value() {
		productValuePage=new ProductValuePage(driver);
		
		productValuePage.enterProductValue();
		productValuePage.clickOnNext();
	}

	@Given("I select a date from calendar")
	public void i_select_a_date_from_calendar() {
		selectProductBuyDatePAge=new SelectProductBuyDatePAge(driver);
		selectProductBuyDatePAge.selectDateBox();
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
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".DayPickerNavigation_leftButton__horizontalDefault"))).click();  
			}
		}
		selectProductBuyDatePAge.clickOnNext();
		
	}

	@Given("I select the product condition")
	public void i_select_the_product_condition() {
		productConditionPage =new ProductConditionPage(driver);
		productConditionPage.selectProductCondition();
		productConditionPage.clickOnNext();
	}

	@Given("Validate the quote page")
	public void validate_the_quote_page() throws IOException, InterruptedException {
	    
		Thread.sleep(5000);
		takeScreenShot(driver);		
		closeBrowser();
	}

}
