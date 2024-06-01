package nisarahmedqae.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nisarahmedqae.dataProviders.DataSets;
import nisarahmedqae.testComponents.BaseTest;
import nisarahmedqae.testComponents.Retry;
import nisarahmedqae.testComponents.MyListener;

public class LoginTest extends BaseTest {

	@Test(groups = {
			"Regression" }, dataProvider = "getLoginData", dataProviderClass = DataSets.class, retryAnalyzer = Retry.class)
	public void LoginValidation(HashMap<String, String> input) {
		// login to application
		landingPage.signInApplication(input.get("email"), input.get("password"));

		if (input.get("dataSetInfo").equals("invalid email")) {
			Assert.assertEquals(landingPage.getMailErrorMessage(), "We cannot find an account with that email address");
		} else if (input.get("dataSetInfo").equals("invalid password")) {
			Assert.assertEquals(landingPage.getPassErrorMessage(), "Your password is incorrect");
		} else if (input.get("dataSetInfo").equals("valid credentials")) {
			Assert.assertTrue(landingPage.getPageTitle().contains("Online Shopping site in India"));
		}

	}

}
