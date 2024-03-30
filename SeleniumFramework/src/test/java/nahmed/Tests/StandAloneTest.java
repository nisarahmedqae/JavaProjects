package nahmed.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAloneTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		String productName = "IPHONE 13 PRO";

		// username
		driver.findElement(By.id("userEmail")).sendKeys("demo.testfire@gmail.com");

		// password
		driver.findElement(By.id("userPassword")).sendKeys("Demo@123");

		// login button
		driver.findElement(By.name("login")).click();

		// explicit wait implementation on global level
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mb-3")));

		// find all cards present on site
		List<WebElement> products = driver.findElements(By.className("mb-3"));

		// select single product
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
				.findFirst().orElse(null);

		// add product to cart
		prod.findElement(By.className("w-10")).click();

		// wait till confirmation message
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

		// wait till loading disappears
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

		// click on cart button
		driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();

		// get product names added in cart
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

		// verify product names added in cart
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));

		// assert if its returning true product match
		Assert.assertTrue(match);

		// click on checkout button
		driver.findElement(By.cssSelector(".subtotal button")).click();

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "India").build()
				.perform();

		// wait till search result is displayed
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		// click on India
		driver.findElement(By.cssSelector(".ta-item:last-of-type")).click();

		// click on place order
		driver.findElement(By.cssSelector("action__submit")).click();

		// printout confirmation message
		System.out.println(driver.findElement(By.cssSelector(".hero-primary")).getText());
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();

		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the Order."));
	}

}
