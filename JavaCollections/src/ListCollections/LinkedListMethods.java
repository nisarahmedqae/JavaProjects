package ListCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// LL is a default class in java
		// it can be used as List, Stack, Queue
		// it allows the null entry
		// dynamic collection
		// hence insertion and deletion can be easily implemented
		// it can contain duplicate elements
		// it is non-synchronized and not thread safe
		// manipulation is fast bcoz we dont need any shifting

		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());

		names.add("Tom");
		names.add("Naveen");
		names.add("Roby");
		names.add("Lisa");

		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(0));

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(4, "Steve");
		System.out.println(names);

		names.add(0, "Ram");
		System.out.println(names);

		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Trump");

		names.addAll(users);
		System.out.println(names);

		names.addFirst("Kamala");
		System.out.println(names);

		names.addLast("Shivin");
		System.out.println(names);

		names.remove(2);
		System.out.println(names);

		names.removeFirst();
		System.out.println(names);

		names.removeAll(users);
		System.out.println(names);

		System.out.println("----------------reverseOrder-------------------");
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(lang.size());
		lang.add("Java"); // 0
		lang.add("Python"); // 1
		lang.add("Ruby"); // 2
		lang.add("JS");// 3

		System.out.println(lang.size());
		// reverse the linkedList:
		Iterator<String> itr = lang.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// sort
		Collections.sort(lang);
		System.out.println(lang);
	}

}
