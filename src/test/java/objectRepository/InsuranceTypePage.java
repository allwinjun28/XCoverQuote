package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceTypePage {

WebDriver driver;
	
	public InsuranceTypePage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css=".col-6.col-sm-4")
	List<WebElement> insuranceType;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement nextButton;
	
	
	public void selectAInsuranceType()
	{
		int insureTypeCount=insuranceType.size();
		
		for(int i=0;i<insureTypeCount;i++)
		{
			String typeName=insuranceType.get(i).getText();
		}
		if(insureTypeCount>0) {
			insuranceType.get(2).click();		
		}
		
		
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}
	
}
