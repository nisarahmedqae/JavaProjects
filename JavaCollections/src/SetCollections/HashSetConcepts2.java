package SetCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts2 {

	public static void main(String[] args) {
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 5, 4, 3, 2, 1 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] { 9, 8, 7, 6, 5 }));

		// get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		System.out.println("---------get the intersection--------------");
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		System.out.println("---------get the differences--------------");
		Set<Integer> differences = new HashSet<Integer>(first);
		differences.removeAll(second);
		System.out.println(differences);
	}

}
