package RahulShettyAcademy;

import java.util.ArrayList;

public class LimitMethod {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		System.out.println("************using limit to limit result*************");
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

}
