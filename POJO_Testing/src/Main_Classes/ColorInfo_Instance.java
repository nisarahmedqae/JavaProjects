package Main_Classes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Classes.ColorInfo;

public class ColorInfo_Instance {

	public static void main(String[] args) throws JsonProcessingException {
		// Create an instance of ColorInfo and set values
		ColorInfo colorInfo = new ColorInfo();
		colorInfo.setColor("red");
		colorInfo.setValue("#f00");

		// Print serialized JSON data for demonstration
		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writeValueAsString(colorInfo);
		System.out.println("Serialized Data: \n" + serializedData);
	}
}
