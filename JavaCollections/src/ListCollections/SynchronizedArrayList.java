package ListCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// using method: Collections.synchronizedList
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add("Ruby");
		nameList.add("C#");

		// add, remove : we don't need explicit synchronization
		// to fetch transverse the values from the list: we have to use explicit
		// synchronization

		synchronized (nameList) {
			Iterator<String> it = nameList.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

		// thread safe variant of ArrayList
		System.out.println("-----------using class CopyOnWriteArrayList-----------");

		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		// we dont need explicit synchronization for any operation:
		// add/remove/transverse

		Iterator<String> it = empList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
