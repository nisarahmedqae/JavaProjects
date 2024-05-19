package nisarahmedqae.dataProviders;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;

import nisarahmedqae.testComponents.BaseTest;

public class DataSets extends BaseTest {

	@DataProvider(name = "getLoginData")
	public Object[][] getLoginData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap("..\\AmazonWebFramework\\testData\\login.json");
		return new Object[][] { { data.get(0) }, { data.get(1) }, { data.get(2) } };
	}
	
	@DataProvider(name = "getProductsData")
	public Object[][] getProductsData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap("..\\AmazonWebFramework\\testData\\products.json");
		return new Object[][] { { data.get(0) }, { data.get(1) }, { data.get(2) } };
	}

}
