package nisarahmedqae.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nisarahmedqae.commonPages.NavigationBar;

public class LandingPage {

    private WebDriver driver;
    private NavigationBar navigationBar;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.navigationBar = new NavigationBar(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(id = "ap_password")
    private WebElement password;

    @FindBy(xpath = "//div[@class='a-alert-content']//span[@class='a-list-item']")
    private WebElement invalidPass;

    @FindBy(xpath = "//span[contains(text(),'email address')]")
    private WebElement invalidMail;

    public LandingPage signInApplication(String inputEmail, String inputPassword) {
        navigationBar.moveToElement(navigationBar.signInEle);

        email.sendKeys(inputEmail);
        email.sendKeys(Keys.ENTER);

        password.sendKeys(inputPassword);
        password.sendKeys(Keys.ENTER);

        return this;
    }

    public String getPassErrorMessage() {
        return invalidPass.getText();
    }

    public String getMailErrorMessage() {
        return invalidMail.getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
