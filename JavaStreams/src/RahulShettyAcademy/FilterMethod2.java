package RahulShettyAcademy;

import java.util.stream.Stream;

public class FilterMethod2 {

	public static void main(String[] args) {
		long f = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();

		System.out.println(f);

		System.out.println("-----------------------------");

		long t = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();

		System.out.println(t);
	}

}
