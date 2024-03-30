package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethod {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("one", "two", "three", "one");

		System.out.println("------------findAny-----------------");
		Optional<String> ele = stringList.stream().findAny();
		System.out.println(ele.get());

		System.out.println("------------findFirst-----------------");
		Optional<String> ele2 = stringList.stream().findFirst();
		System.out.println(ele2.get());
	}

}
