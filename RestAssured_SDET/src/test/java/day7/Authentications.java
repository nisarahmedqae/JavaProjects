package day7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authentications {

	@Test(priority=1)
	void testBasicAuthentication() {
		given().auth().basic("userName", "password")
		.when().get("https://postman-echo.com/basic-auth")
		.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	}
	
	@Test(priority=2)
	void testDigestAuthentication() {
		given().auth().digest("userName", "password")
		.when().get("https://postman-echo.com/basic-auth")
		.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	}
	
	@Test(priority=3)
	void testPreemptiveAuthentication() {
		given().auth().preemptive().basic("username", "password")
		.when().get("https://postman-echo.com/basic-auth")
		.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	}
	
	@Test(priority=4)
	void testBearerTokenAuthentication() {
		String bearerToken = "blank";
		given().headers("Authorization", "Bearer "+ bearerToken)
		.when().get("https://api.github.com/user/repos")
		.then().statusCode(200);
	}
	
	@Test(priority=5)
	void testOAuth1Authentication() {
		// oauth1.0
		given().auth().oauth("consumerKey", "consumerSecret", "accessToken", "secretToken") 
		.when().get("url")
		.then().statusCode(200);
	}
	
	@Test(priority=6)
	void testOAuth2Authentication() {
		// oauth2.0
		given().auth().oauth2("accessToken") 
		.when().get("https://api.github.com/user/repos")
		.then().statusCode(200);
	}
	
	@Test(priority=7)
	void testAPIKeyAuthentication() {
		// oauth1.0
		given().log().all().queryParam("API key", "186af0cd1fa54fe14d4607e27b30c871") //appid is API Key
		.queryParam("lat", "33.44").queryParam("lon", "90.23").queryParam("part", "minutely")
		.when().get("https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}")
		.then().statusCode(200);
	}
}
