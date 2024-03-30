package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification req;
	
	public RequestSpecification requestSpecification() throws IOException {
		if(req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key", "qaclick123")
		.addFilter(RequestLoggingFilter.logRequestTo(log))
		.setContentType(ContentType.JSON).build();
		return req;
		}
		return req;
	}
	
	public static String getGlobalValue(String key) throws IOException {
		String userHome = System.getProperty("user.home");
		String workspacePath = "git/JavaProjects/APIFramework/src/test/java/resources/global.properties";
		String fullPath = Paths.get(userHome, workspacePath).toString();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fullPath);
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public String getJsonPath(Response response, String key) {
		String resp = response.asString();
		JsonPath js= new JsonPath(resp);
		return js.get(key).toString();
	}

}
