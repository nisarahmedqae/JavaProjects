package nisarahmedqae.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import nisarahmedqae.testComponents.BaseTest;
import nisarahmedqae.testComponents.Retry;

public class test1 extends BaseTest {

	@Test(groups = { "Regression" })
	public void validLoginTest() {
		// login to application
		landingPage.signInApplication("nisarahmed.qae@gmail.com", "Testpass@123");
		//assertEquals(landingPage.getErrorMessage(), "Incorrect email or password.");
	}
	
	@Test(groups = { "ErrorHandling" }, retryAnalyzer = Retry.class)
	public void invalidLoginTest() throws IOException, InterruptedException {
		// login to application
		landingPage.signInApplication("nisarahmed.qae@gmail.com", "Testpass@123");
		//assertEquals(landingPage.getErrorMessage(), "Incorrect email or password.");
	}

}
