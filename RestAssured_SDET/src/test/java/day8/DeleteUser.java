package day8;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUser {

	@Test
	void test_deleteUser(ITestContext context) {
		String bearerToken = "42614f0980201e604c71f91fb7d3f0d89ee454f2e5cb000622412473c0df5f80";
		// int id = (int) context.getAttribute("user_id"); // this is coming from create
		// user request
		int id = (int) context.getSuite().getAttribute("user_id");

		given().headers("Authorization", "Bearer " + bearerToken).pathParam("id", id).when()
				.delete("https://gorest.co.in/public/v2/users/{id}").then().statusCode(204);
	}

}
