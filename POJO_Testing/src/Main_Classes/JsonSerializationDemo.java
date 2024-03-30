package Main_Classes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import POJO_Classes.JsonSerializationData;

public class JsonSerializationDemo {

	public static void main(String[] args) throws JsonProcessingException {

		// Serialization
		JsonSerializationData pdata = new JsonSerializationData();
		pdata.setName("Alan");
		pdata.setValue(12);

		ObjectMapper mapper = new ObjectMapper();
		String serializedData = mapper.writeValueAsString(pdata);
		System.out.println("Serialized Data: \n" + serializedData);

		System.out.println("**************************************");

		// Deserialization
		JsonSerializationData deserializedData = mapper.readValue(serializedData, JsonSerializationData.class);
		System.out.println("Deserialized Data:");
		System.out.println("Name: " + deserializedData.getName());
		System.out.println("Value: " + deserializedData.getValue());
	}
}
