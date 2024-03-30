package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups = { "Smoke" })
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}

	@Test
	public void SecondTest() {
		System.out.println("bye");
	}

}
