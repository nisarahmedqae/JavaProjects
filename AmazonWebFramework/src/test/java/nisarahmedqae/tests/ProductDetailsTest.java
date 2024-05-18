package nisarahmedqae.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import nisarahmedqae.commonPages.NavigationBar;
import nisarahmedqae.testComponents.BaseTest;

public class ProductDetailsTest extends BaseTest {

	@Test(groups = { "Regression" })
	public void GetSearchedProducts() {
		NavigationBar navigationBar = landingPage.goToNavigationBarPage();
		navigationBar.searchProduct("xiaomi 14");
		List<WebElement> productList = navigationBar.getProductList();

		productList.stream().forEach(s -> System.out.println(s.getText()));
	}

	@Test(groups = { "Regression" })
	public void GetProductPrice() {
		NavigationBar navigationBar = landingPage.goToNavigationBarPage();
		navigationBar.searchProduct("xiaomi 14");
		List<WebElement> productList = navigationBar.getProductList();

		productList.stream().filter(s -> s.getText().contains("Xiaomi 14 (White, 12GB RAM, 512GB Storage)"))
				.forEach(s -> {
					WebElement priceElement = s.findElement(By.xpath("following::span[@class='a-price-whole']"));
					System.out.println(priceElement.getText());
				});

	}

}
