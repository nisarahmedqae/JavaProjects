package nahmed.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import nahmed.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// pageFactory
	// get product names added in cart
	@FindBy(css = ".cartSection h3")
	private List<WebElement> productTitles;

	// click on checkout button
	@FindBy(css = ".subtotal button")
	WebElement checkOutEle;

	// verify product names added in cart
	public boolean verifyProductDisplay(String productName) {
		Boolean match = productTitles.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}

	// click on checkout button
	public CheckoutPage goToCheckout() {
		checkOutEle.click();
		return new CheckoutPage(driver);
	}
}
