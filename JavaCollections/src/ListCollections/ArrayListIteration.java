package ListCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Steve");
		studentList.add("Lisa");

		System.out.println("------------typical for loop-------------");

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

		System.out.println("-------------for each loop-----------------");

		for (String stud : studentList) {
			System.out.println(stud);
		}

		System.out.println("-------------stream-----------------");

		studentList.stream().forEach(s -> System.out.println(s));

		System.out.println("-------------iterator-----------------");
		Iterator<String> it = studentList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------------list with other collection-----------------");
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbersList);

		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Java", "Python", "JS"));
		System.out.println(namesList);
		System.out.println(namesList.size());
	}

}
