package nahmed.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import nahmed.TestComponents.BaseTest;
import nahmed.pageObjects.CartPage;
import nahmed.pageObjects.CheckoutPage;
import nahmed.pageObjects.ConfirmationPage;
import nahmed.pageObjects.OrderPage;
import nahmed.pageObjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest {
	String productName = "IPHONE 13 PRO";

	@Test(dataProvider = "getData", groups = { "Purchase" })
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

		// login to application
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));

		productCatalogue.addProductToCart(input.get("product"));
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.verifyProductDisplay(input.get("product"));

		// assert if its returning true product match
		Assert.assertTrue(match);

		// click on checkout button
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		// confirmation message
		String confirmMessage = confirmationPage.getConfirmationMessage();

		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the Order."));

	}

	@Test(dependsOnMethods = { "submitOrder" })
	public void OrderHistoryTest() {
		ProductCatalogue productCatalogue = landingPage.loginApplication("demo.testfire@gmail.com", "Demo@123");
		OrderPage orderPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "//src//test//java//nahmed//Data//PurchaseOrder.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
