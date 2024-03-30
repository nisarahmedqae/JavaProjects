package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "car", "flight", "train", "bicycle");

		System.out.println("-------------distinct-------------");
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);

		System.out.println("-------------count-------------");
		long countVehicles = vehicles.stream().distinct().count();
		System.out.println(countVehicles);

		System.out.println("-------------limit-------------");
		List<String> limitVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitVehicles);
	}

}
