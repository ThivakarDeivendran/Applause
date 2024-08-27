package pomPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	public static WebDriver driver;
	
	public PageObjectClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);			
	}
	
	
	@FindBy(xpath="//a[contains(@href,'/parfum/01')]")
	private WebElement perfumeTab;

	public WebElement getPerfumeTab() {
		return perfumeTab;
	}


	@FindBy(xpath="//h1[contains(@class, 'product-overview')]")
	private WebElement productOverView;

	public WebElement getProductOverView() {
		return productOverView;
	}
	
	@FindBy(xpath="//div[@class='facet__title' and @data-testid='flags']")
	private WebElement highlightsDropdown;

	public WebElement getHighlightsDropdown() {
		return highlightsDropdown;
	}
	
	@FindBy(xpath="//*[text()='Sale']/ancestor::a//input")
	private WebElement saleCheckBox;
	
	public WebElement getSaleCheckBox() {
		return saleCheckBox;
	}
	
	@FindBy(xpath="//font[contains(text(),'Show')]/ancestor::button")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath="//div[@class='facet__title' and @data-testid='brand']/span")
	private WebElement tickMark;

	public WebElement getTickMark() {
		return tickMark;
	}
	
	@FindBy(xpath="//div[@class='facet__title' and @data-testid='brand']")
	private WebElement brandDropDown;

	public WebElement getBrandDropDown() {
		return brandDropDown;
	}
	
	@FindBy(xpath="//input[@name='facet-search']")
	private WebElement brandTextBox;

	public WebElement getBrandTextBox() {
		return brandTextBox;
	}
	
	@FindBy(xpath="//input[contains(@class,'L0cGE')]")
	private WebElement firstElementCheckBox;

	public WebElement getFirstElementCheckBox() {
		return firstElementCheckBox;
	}
	
	@FindBy(xpath="//div[@class='facet__title' and @data-testid='classificationClassName']")
	private WebElement productTypeDropdown;

	public WebElement getProductTypeDropdown() {
		return productTypeDropdown;
	}
	
	@FindBy(xpath="//div[@class='facet__title' and @data-testid='gender']")
	private WebElement forWhomdropdown;

	public WebElement getForWhomdropdown() {
		return forWhomdropdown;
	}
	
	@FindBy(xpath="//div[contains(@class,'product-tile')]/a")
	private List<WebElement> productList;
	
	public List<WebElement> getProductList() {
		return productList;
	}
	
	@FindBy(xpath="//div[@class='product-info']/div/div[contains(@class,'text name')]/font")
	private List<WebElement> productTextElement;

	public List<WebElement> getProductTextElement() {
		return productTextElement;
	}

	@FindBy(xpath="//*[text()='Clear all filters']/ancestor::button")
	private WebElement clearAllFiltersButton;
	
	public WebElement getClearAllFiltersButton() {
		return clearAllFiltersButton;
	}

}
