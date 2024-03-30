package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Classes.Values;

public class Values_Instance {

	public static void main(String[] args) throws JsonProcessingException {
		// Create a list of integers
		List<Integer> valuesList = new ArrayList<>();
		valuesList.add(100);
		valuesList.add(500);
		valuesList.add(300);
		valuesList.add(200);
		valuesList.add(400);

		// Create an instance of IntArray and set the list of integers
		Values values = new Values();
		values.setValues(valuesList);

		// Print serialized JSON data for demonstration
		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writeValueAsString(valuesList);
		System.out.println("Serialized Data: \n" + serializedData);
	}
}
