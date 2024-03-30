package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("------------reduce-----------------");
		Optional<Integer> reduce = numbersList.stream().reduce((val1, val2) -> {
			return val1 + val2;
		});
		System.out.println(reduce.get());

		System.out.println("------------reduce: multiply-----------------");
		Optional<Integer> multiply = numbersList.stream().reduce((val1, val2) -> {
			return val1 * val2;
		});
		System.out.println(multiply.get());
	}

}
