package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	@Parameters({ "URL", "APIkey" })
	public void beforeClass(String URL, String APIkey) {
		System.out.println("before executing any methods in the class");
		System.out.println(URL);
		System.out.println(APIkey);
	}

	@Test(groups = { "Smoke" })
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCar");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCar");
	}

	@Test(timeOut = 4000)
	public void ApiLoginCarLoan() {
		System.out.println("ApiLoginCar");
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("I will execute before every test method in day 3 class");
	}

	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("I will execute after every test method in day 3 class");
	}

	@Test(dataProvider = "getData")
	public void usingDataProvider(String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);
	}

	@DataProvider
	public Object[][] getData() {
		// combination1: username/password of good credit history
		// combination1: username/password of bad credit history
		// combination1: username/password of fraudlent customers
		Object[][] data = new Object[3][2];

		// 1st Set
		data[0][0] = "firstUsername";
		data[0][1] = "firstPassword";
		// columns in the row are nothing but values for that particular
		// combination(row)

		// 2nd Set
		data[1][0] = "secondUsername";
		data[1][1] = "secondPassword";

		// 2nd Set
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdPassword";

		return data;
	}
}
