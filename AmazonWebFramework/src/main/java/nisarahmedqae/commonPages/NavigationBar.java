package nisarahmedqae.commonPages;

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

	public void moveToElement(WebElement element) {
		actions.moveToElement(element).click().perform();
	}
}
