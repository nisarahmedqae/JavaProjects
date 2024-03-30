package nahmed.Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import nahmed.TestComponents.BaseTest;
import nahmed.TestComponents.Retry;
import nahmed.pageObjects.CartPage;
import nahmed.pageObjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups = { "ErrorHandling" }, retryAnalyzer = Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {
		// login to application
		landingPage.loginApplication("demo.testfire@gmail.com", "wrongPassword");
		assertEquals(landingPage.getErrorMessage(), "Incorrect email or password.");
	}

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {
		String productName = "IPHONE 13 PRO";

		// login to application
		ProductCatalogue productCatalogue = landingPage.loginApplication("demo.testfire@gmail.com", "Demo@123");

		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.verifyProductDisplay("IPHONE Ultra");

		// assert if its returning true product match
		Assert.assertFalse(match);
	}

}
