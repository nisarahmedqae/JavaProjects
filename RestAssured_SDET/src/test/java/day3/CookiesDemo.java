package day3;

import static io.restassured.RestAssured.*;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {

	@Test(priority=1)
	void testCookies() {
		given()
		.when().get("https://www.google.com")
		.then().cookie("AEC", "3DWhIv_He3P-4lkWjOlXlg");
	}
	
	@Test(priority=2)
	void getCookiesInfo() {
		Response res= given()
		.when().get("https://www.google.com");
		 
		Map<String, String> cookiesMap = res.getCookies();
		System.out.println(cookiesMap.keySet());
		
		cookiesMap.forEach((k,v)->System.out.println(k +" : "+ v));
	}
}
