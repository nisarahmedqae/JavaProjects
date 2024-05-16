package nisarahmedqae.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {

	WebDriver driver;
	Actions actions = new Actions(driver);
	
	public NavigationBar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-link-accountList")
	WebElement signInEle;

	@FindBy(id = "ap_email")
	WebElement userName;

	@FindBy(name = "ap_password")
	WebElement password;


	public void goToUrl() {
		driver.get("https://amazon.in");
	}
	
	public Actions moveToElement() {
		actions.moveToElement(signInEle).click().perform();
		return actions;
	}

	public NavigationBar loginApplication(String email, String password) {
		userName.sendKeys(email);
		password.sendKeys(password);
		submit.click();

		return new NavigationBar(driver);
	}
	
	//********************************************************
	

	
	// enter username
	WebElement userName = driver.findElement(By.id("ap_email"));
	userName.click();
	userName.sendKeys("nisarahmed812@gmail.com");

	driver.findElement(By.id("continue")).click();

	// enter password
	WebElement password = driver.findElement(By.id("ap_password"));
	password.click();
	password.sendKeys("Testpass@123");
	password.sendKeys(Keys.ENTER);

	// click on search field
	WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
	searchField.click();
	searchField.sendKeys("xiaomi 14");
	searchField.sendKeys(Keys.ENTER);

}
