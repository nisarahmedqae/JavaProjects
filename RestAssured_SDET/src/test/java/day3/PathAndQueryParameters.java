package day3;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PathAndQueryParameters {

	@Test(priority = 1)
	void getUsers() {
		given().log().all().pathParam("mypath", "users").queryParam("page", 2).queryParam("id", 5).when()
				.get("https://reqres.in/api/{mypath}").then().statusCode(200);
	}
}
