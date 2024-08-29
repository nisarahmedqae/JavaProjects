package pages;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.ScreenObject.screen;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.codeborne.selenide.CollectionCondition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen {

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='store item']")
	
	@iOSXCUITFindBy(xpath = "//*[@name='store item text']")
	private List<WebElement> products;

	public ProductDescriptionScreen clickProduct1() {
		$$(products).shouldBe(CollectionCondition.sizeGreaterThan(0)).get(0).click();
		return screen(ProductDescriptionScreen.class);
	}
}
