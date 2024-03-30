package nahmed.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nahmed.AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// pageFactory
	@FindBy(className = "mb-3")
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement spinner;

	By productsBy = By.className("mb-3");
	By addToCart = By.className("w-10");
	By toastMessage = By.id("toast-container");

	// find all cards present on site
	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}

	// select single product
	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
				.findFirst().orElse(null);
		return prod;
	}

	// add product to cart
	public void addProductToCart(String productName) throws InterruptedException {
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();

		// wait till confirmation message
		waitForElementToAppear(toastMessage);

		// wait till loading disappears
		waitForElementToDisappear(spinner);
	}
}
