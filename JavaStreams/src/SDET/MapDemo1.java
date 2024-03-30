package SDET;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

		// uppercase
		vehicles.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

		// length
		vehicles.stream().map(name -> name.length()).forEach(n -> System.out.println(n));
	}

}
