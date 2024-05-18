package nisarahmedqae.commonPages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {

	protected WebDriver driver;
	protected Actions actions;

	public NavigationBar(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-link-accountList")
	public WebElement signInEle;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBar;

	@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']//h2//a//span")
	public List<WebElement> products;

	public void moveToElement(WebElement element) {
		actions.moveToElement(element).click().perform();
	}

	public void searchProduct(String searchKey) {
		searchBar.click();
		searchBar.sendKeys(searchKey);
		searchBar.sendKeys(Keys.ENTER);
	}

	public List<WebElement> getProductList() {
		return products;
	}
}
