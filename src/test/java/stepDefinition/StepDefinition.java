package stepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import mainPackage.ReusableMethod;
import pomPackage.PageObjectClass;



public class StepDefinition extends  ReusableMethod{	

	public static WebDriver driver;
	public SoftAssert softAssert= new SoftAssert();
	private static final Logger logger = LoggerFactory.getLogger(StepDefinition.class);
	PageObjectClass pageObjectVariable;
	
	@Given("User Launch the Browser")
	public void user_launch_the_browser() {
		driver=launchBrowserMethod(readPropertyFile("Browser"));
		maximizeWindowMethod();
		staticWaitMethod(3000);  
		deleteAllCookiesMethod();
	}

	@When("User Navigate into URL")
	public void user_navigate_into_url() throws AWTException {
		getBrowserMethod(readPropertyFile("webURL"));
		RobotMethod();
		staticWaitMethod(3000); 
		
	}

	@Then("User Validate the title of Application")
	public void user_validate_the_title_of_application() {
		softAssert.assertTrue(containsMethod(driver.getTitle(),readPropertyFile("AppTitle")));
	}

	@Then("User click {string} Tab in the Application")
	public void user_click_tab_in_the_application(String string) {
		pageObjectVariable= new PageObjectClass(driver);
		clickMethod(pageObjectVariable.getPerfumeTab());
		staticWaitMethod(3000); 
	}
	
	@Given("User select the sale from the highlights dropdown")
	public void user_select_the_sale_from_the_highlights_dropdown() {
		executeScriptScrollToElement(pageObjectVariable.getProductOverView());
		staticWaitMethod(4000);
		clickMethod(pageObjectVariable.getHighlightsDropdown());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSaleCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}
	@Given("User select the Limited from the highlights dropdown")
	public void user_select_the_limited_from_the_highlights_dropdown() {
		executeScriptScrollToElement(pageObjectVariable.getProductOverView());
		staticWaitMethod(4000);
		clickMethod(pageObjectVariable.getHighlightsDropdown());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getLimitedCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}
	@When("User Enter the brand NameLimited in the brand dropdown")
	public void user_enter_the_brand_name_limited_in_the_brand_dropdown() {
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getBrandDropDown());
		staticWaitMethod(3000);
		sendKeysMethod(pageObjectVariable.getBrandTextBox(),readPropertyFile("BrandLimited"));
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getFirstElementCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}

	@When("User Enter the brand Name in the brand dropdown")
	public void user_enter_the_brand_name_in_the_brand_dropdown() {
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getBrandDropDown());
		staticWaitMethod(3000);
		sendKeysMethod(pageObjectVariable.getBrandTextBox(),readPropertyFile("Brand"));
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getFirstElementCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}

	@When("User select the productType in the ProductType dropdown")
	public void user_select_the_product_type_in_the_product_type_dropdown() {
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getProductTypeDropdown());
		staticWaitMethod(3000);
		clickMethod(pageObjectVariable.getFirstElementCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}

	@When("User select gender from the forWhom Dropdown")
	public void user_select_gender_from_the_for_whom_dropdown() {
	    staticWaitMethod(2000);
	    clickMethod(pageObjectVariable.getForWhomdropdown());
	    staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getFirstElementCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}

	@Then("User validate the listOfProducts and print the Name")
	public void user_validate_the_list_of_products_and_print_the_name() {
		System.out.println("Total Products  :  " +listSizeMethod(pageObjectVariable.getProductList()));
		forEachMethod(pageObjectVariable.getProductTextElement());
		staticWaitMethod(5000);
	}

	@And("User clear the filters button")
	public void User_clear_the_filters_button() {
		clickMethod(pageObjectVariable.getClearAllFiltersButton());
		staticWaitMethod(3000);
	}
	
	@Given("User select the Gift in the highlights dropdown")
	public void user_select_the_gift_in_the_highlights_dropdown() {
		executeScriptScrollToElement(pageObjectVariable.getProductOverView());
		staticWaitMethod(3000);
		clickMethod(pageObjectVariable.getHighlightsDropdown());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getGiftCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));
	}
	@When("User Enter the ProductTypeName in the productTypedropdown")
	public void user_enter_the_product_type_name_in_the_product_typedropdown() {
		clickMethod(pageObjectVariable.getProductTypeDropdown());
		staticWaitMethod(3000);
		staticWaitMethod(3000);
		sendKeysMethod(pageObjectVariable.getBrandTextBox(),readPropertyFile("ProductType"));
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getFirstElementCheckBox());
		staticWaitMethod(2000);
		clickMethod(pageObjectVariable.getSubmitButton());
		staticWaitMethod(2000);
		softAssert.assertTrue(isdisplayedMethod(pageObjectVariable.getTickMark()));	
	}
	@And("User Close the Browser")
	public void user_close_the_browser() {
		browserQuitMethod();
	}

}
