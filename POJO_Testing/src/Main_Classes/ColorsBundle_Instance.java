package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Classes.ColorsBundle;

public class ColorsBundle_Instance {

	public static void main(String[] args) throws JsonProcessingException {
		// Create ColorInfo instances
		ColorsBundle redBundle = new ColorsBundle();
		redBundle.setColor("red");
		redBundle.setValue("#f00");

		ColorsBundle greenBundle = new ColorsBundle();
		greenBundle.setColor("green");
		greenBundle.setValue("#0f0");

		ColorsBundle blueBundle = new ColorsBundle();
		blueBundle.setColor("blue");
		blueBundle.setValue("#00f");

		// Create a list of ColorInfo instances
		List<ColorsBundle> colorsBundleList = new ArrayList<>();
		colorsBundleList.add(redBundle);
		colorsBundleList.add(greenBundle);
		colorsBundleList.add(blueBundle);

		// Print serialized JSON data for demonstration
		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writeValueAsString(colorsBundleList);
		System.out.println("Serialized Data: \n" + serializedData);
	}
}
