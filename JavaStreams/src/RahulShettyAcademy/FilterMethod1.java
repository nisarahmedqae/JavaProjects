package RahulShettyAcademy;

import java.util.ArrayList;

public class FilterMethod1 {

	// there is no life of intermediate operation if there is no terminal operation
	// terminal operation will execute only if intermediate operation (filter)
	// returns true
	// we can create stream with stream package

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("------------Stream-----------------");
		long c = names.stream().filter(s -> s.startsWith("A")).count(); // count data type is long
		System.out.println(c);
	}

}
