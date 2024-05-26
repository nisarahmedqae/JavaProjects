package nisarahmedqae.tests;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import nisarahmedqae.commonPages.NavigationBar;
import nisarahmedqae.dataProviders.DataSets;
import nisarahmedqae.testComponents.BaseTest;
import nisarahmedqae.testComponents.Retry;

public class ProductDetailsTest extends BaseTest {

	@Test(groups = { "Regression" }, retryAnalyzer = Retry.class)
	public void GetSearchedProducts() {
		NavigationBar navigationBar = landingPage.getNavigationBar();
		navigationBar.searchProduct("AC");
		List<WebElement> productList = navigationBar.getProductList();

		productList.stream().forEach(s -> System.out.println(s.getText()));

		Assert.assertTrue(productList.size() > 1, "Product list should contain more than one product.");
	}

	@Test(enabled = false, groups = {
			"Regression" }, dataProvider = "getProductsData", dataProviderClass = DataSets.class, retryAnalyzer = Retry.class)
	public void GetProductPrice(HashMap<String, String> input) {
		NavigationBar navigationBar = landingPage.getNavigationBar();
		navigationBar.searchProduct(input.get("searchedProduct"));
		List<WebElement> productList = navigationBar.getProductList();

		String price = productList.stream().filter(s -> s.getText().contains(input.get("productName"))).findFirst()
				.map(s -> {
					WebElement priceElement = s.findElement(By.xpath("following::span[@class='a-price-whole']"));
					return priceElement.getText();
				}).orElse(null);

		System.out.println(input.get("productName") + " : " + price);
		Assert.assertEquals(price, input.get("price"));

	}

}
