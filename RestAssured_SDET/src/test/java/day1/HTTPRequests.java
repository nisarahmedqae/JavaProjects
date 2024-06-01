package day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequests {
	String id;

	@Test(priority = 1)
	void getUsers() {
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("page", equalTo(2));
	}

	@Test(priority = 2)
	void createUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "pavan");
		data.put("job", "trainer");

		id = given().contentType("application/json").body(data).when().post("https://reqres.in/api/users").jsonPath()
				.get("id");
		System.out.println(id);
	}

	@Test(priority = 3)
	void updateUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "pavan");
		data.put("job", "trainer");

		given().contentType("application/json").body(data).when().put("https://reqres.in/api/users/" + id).then()
				.statusCode(200);
	}

	@Test(priority = 4)
	void deleteUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "pavan");
		data.put("job", "trainer");

		given().when().delete("https://reqres.in/api/users/" + id).then().statusCode(204);
	}
}
