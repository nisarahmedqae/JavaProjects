package nahmed;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReUsableMethods;
import files.payload;

public class Basics {

	public static void main(String[] args) throws IOException {
		//Add Place ->
		
		//Validate if Add Place API is working as expected
		
		//Given: all input details
		//When: Submit the API
		//Then: validate the response
		//content of the file to string -> content of file can convert into Byte -> Byte data into String
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		//.body(payload.AddPlace())
		.body(new String(Files.readAllBytes(Paths.get("D:\\Nisar Ahmed\\QA Testing\\Rest Assured_RSA\\addPlace.txt"))))
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

	    System.out.println(response);
	    
	    JsonPath js = new JsonPath(response);  //for parsing json
	    String placeId = js.getString("place_id");
	    System.out.println(placeId);
	    
		//Update Place with New Address ->
	    String newAddress = "Summer Walk, Africa";
	    
	    given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	    .header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	    
	    // -> Get place to validate if new address is present in address
	    String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	    .when().get("/maps/api/place/get/json")
	    .then().log().all().assertThat().statusCode(200).extract().response().asString();
	    
	    JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
	    String actualAddress = js1.getString("address");
	    System.out.println(actualAddress);
	    Assert.assertEquals(actualAddress, newAddress);
	}

}
