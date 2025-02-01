package NAHMED;

import java.util.Arrays;
import java.util.List;

public class FirstGreaterEle {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 20);
		int first = numbers.stream().filter(n -> n >= 10).findFirst().orElse(-1);
		System.out.println(first); // Output: 12

	}

}
