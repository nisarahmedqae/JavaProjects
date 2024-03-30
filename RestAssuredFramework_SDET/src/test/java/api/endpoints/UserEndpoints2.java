package api.endpoints;

import static io.restassured.RestAssured.*;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.response.Response;

public class UserEndpoints2 {
	
	//method created for getting URLs from properties file
	static ResourceBundle getURL(){
		ResourceBundle routes = ResourceBundle.getBundle("routes"); //load properties file
		return routes;
	}

	public static Response createUser(User payload) {
		String post_url = getURL().getString("post_url");
		
		Response response = given().contentType("application/json").accept("application/json").body(payload).when()
				.post(post_url);
		return response;
	}

	public static Response readUser(String username) {
		String get_url = getURL().getString("get_url");
		
		Response response = given().pathParam("username", username).when().get(get_url);
		return response;
	}

	public static Response updateUser(String username, User payload) {
		String update_url = getURL().getString("update_url");
		
		Response response = given().contentType("application/json").accept("application/json")
				.pathParam("username", username).body(payload).when().put(update_url);
		return response;
	}

	public static Response deleteUser(String username) {
		String delete_url = getURL().getString("delete_url");
		
		Response response = given().pathParam("username", username).when().delete(delete_url);
		return response;
	}
}
