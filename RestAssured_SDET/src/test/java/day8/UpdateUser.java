package day8;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;

public class UpdateUser {

	@Test
	void test_updateUser(ITestContext context) {
		Faker faker = new Faker();

		JSONObject data = new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");

		String bearerToken = "42614f0980201e604c71f91fb7d3f0d89ee454f2e5cb000622412473c0df5f80";
		// int id = (int) context.getAttribute("user_id"); // this is coming from create
		// user request
		int id = (int) context.getSuite().getAttribute("user_id");

		given().headers("Authorization", "Bearer " + bearerToken).contentType("application/json").pathParam("id", id)
				.body(data.toString()).when().put("https://gorest.co.in/public/v2/users/{id}");
	}

}
