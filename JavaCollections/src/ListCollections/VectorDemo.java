package ListCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		System.out.println(names.size());

		names.add("Tom");
		names.add("Naveen");
		names.add("Roby");
		names.add("Lisa");

		System.out.println(names);
		System.out.println(names.get(2));
		System.out.println(names.remove(3));

		Vector<String> addedNames = new Vector<String>();
		addedNames.add("Peter");
		addedNames.add("Trump");

		names.addAll(addedNames);
		System.out.println(names);

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// sort
		Collections.sort(names);
		System.out.println(names);
	}

}
