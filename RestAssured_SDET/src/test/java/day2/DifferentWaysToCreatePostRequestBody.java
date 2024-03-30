package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DifferentWaysToCreatePostRequestBody {
	// Post request body using HashMap
	@Test(priority = 1)
	void payloadUsingHashMap() throws JsonProcessingException {
		HashMap<Object, Object> data = new HashMap<Object, Object>();
		data.put("name", "Scott");
		data.put("location", "france");
		data.put("phone", "123456");

		String courseArr[] = { "C", "C++" };
		data.put("courses", courseArr);

		// Create an ObjectMapper
		ObjectMapper objectMapper = new ObjectMapper();

		// Convert the HashMap to JSON
		String jsonData = objectMapper.writeValueAsString(data);

		// Print the JSON data
		System.out.println(jsonData);

	}

	// Post request body using org.json library
	@Test(priority = 2)
	void payloadUsingOrgJson() throws JsonProcessingException {
		JSONObject data = new JSONObject();
		data.put("name", "Scott");
		data.put("location", "france");
		data.put("phone", "123456");

		String courseArr[] = { "C", "C++" };
		data.put("courses", courseArr);

		System.out.println(data);
		// .body(data.toString());
	}

	// Post request body using org.json library
	@Test(priority = 3)
	void payloadUsingExternalJsonFile() throws JsonProcessingException, FileNotFoundException {
		String filePath = ".\\body.json";
		File file = new File(filePath);
		FileReader fileReader = new FileReader(file);
		JSONTokener tokener = new JSONTokener(fileReader);
		JSONObject data = new JSONObject(tokener);

		System.out.println(data);
		// .body(data.toString());
	}
}
