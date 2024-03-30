package day8;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;

public class CreateUser {

	@Test
	void test_createUser(ITestContext context) {
		Faker faker = new Faker();

		JSONObject data = new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "inactive");

		String bearerToken = "42614f0980201e604c71f91fb7d3f0d89ee454f2e5cb000622412473c0df5f80";

		int id = given().headers("Authorization", "Bearer " + bearerToken).contentType("application/json")
				.body(data.toString()).when().post("https://gorest.co.in/public/v2/users").jsonPath().getInt("id");
		System.out.println(id);
		
		context.setAttribute("user_id", id); // test level
		context.getSuite().setAttribute("user_id", id); // suite level
	}

}
