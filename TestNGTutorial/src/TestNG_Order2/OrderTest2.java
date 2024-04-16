package TestNG_Order2;

import org.testng.annotations.*;

public class OrderTest2 {

	@Test
	public void ClassTwo_Test1() {
		System.out.println("ClassTwo_Test1");
	}

	@Test
	public void ClassTwo_Test2() {
		System.out.println("ClassTwo_Test2");
	}

	@BeforeTest
	public void BeforeTest2() {
		System.out.println("BeforeTest2");
	}

	@AfterTest
	public void AfterTest2() {
		System.out.println("AfterTest2");
	}

	@BeforeSuite
	public void BeforeSuite2() {
		System.out.println("BeforeSuite2");
	}

	@AfterSuite
	public void AfterSuite2() {
		System.out.println("AfterSuite2");
	}

	@BeforeClass
	public void BeforeClass2() {
		System.out.println("BeforeClass2");
	}

	@AfterClass
	public void AfterClass2() {
		System.out.println("AfterClass2");
	}

	@BeforeMethod
	public void BeforeMethod2() {
		System.out.println("BeforeMethod2");
	}

	@AfterMethod
	public void AfterMethod2() {
		System.out.println("AfterMethod2");
	}

}
