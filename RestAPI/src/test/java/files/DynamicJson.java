package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")
				.body(payload.AddBook(isbn, aisle))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReUsableMethods.rawToJson(response);
		String id = js.get("ID");
		System.out.println(id);
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData() {
		//arrays= collection of elements
		//example= new object[] {1,2,3  };
		
		//multidimensional arrays= collection of arrays
		//example= new object[][] {array1, array2, array3  };
		//example= new object[][] {{array1}, {array2}, {array3}  };
		
		return new Object[][] {{"setA", "123"}, {"setB", "456"}, {"setC", "789"}};
	}

}
