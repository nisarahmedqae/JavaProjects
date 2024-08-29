package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductDescriptionScreen {

	@AndroidFindBy(accessibility = "Add To Cart Button")

	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Add To Cart'")
	private WebElement addToCart;
	
	public void checkWhetherAddToCartButtonIsPresent() {
		$(addToCart).shouldHave(visible);
	}
}
