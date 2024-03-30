package RahulShettyAcademy;

import java.util.Arrays;
import java.util.List;

public class MatchMethod {

	public static void main(String[] args) {

		// converting arrays to arraylist
		List<String> names = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");

		// using limit to limit result
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("--------------------------");

		// to check boolean result
		boolean status = names.stream().anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(status);
	}

}
