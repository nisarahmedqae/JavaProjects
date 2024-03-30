package RahulShettyAcademy;

import java.util.stream.Stream;

public class MapMethod {

	public static void main(String[] args) {
		// print names which has last letter as "a" with UPPERCASE
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("--------------------------");

		// print names which has last letter as "a" with UPPERCASE
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}

}
