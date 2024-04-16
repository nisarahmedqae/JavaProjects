package TestNG_Order1;

import org.testng.annotations.*;

public class OrderTest1 {

	@Test
	public void ClassOne_Test1() {
		System.out.println("ClassOne_Test1");
	}

	@Test
	public void ClassOne_Test2() {
		System.out.println("ClassOne_Test2");
	}

	@BeforeTest
	public void BeforeTest1() {
		System.out.println("BeforeTest1");
	}

	@AfterTest
	public void AfterTest1() {
		System.out.println("AfterTest1");
	}

	@BeforeSuite
	public void BeforeSuite1() {
		System.out.println("BeforeSuite1");
	}

	@AfterSuite
	public void AfterSuite1() {
		System.out.println("AfterSuite1");
	}

	@BeforeClass
	public void BeforeClass1() {
		System.out.println("BeforeClass1");
	}

	@AfterClass
	public void AfterClass1() {
		System.out.println("AfterClass1");
	}

	@BeforeMethod
	public void BeforeMethod1() {
		System.out.println("BeforeMethod1");
	}

	@AfterMethod
	public void AfterMethod1() {
		System.out.println("AfterMethod1");
	}

}
