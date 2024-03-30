package MapCollections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Naveen", 10);
		marks.put("Tom", 30);
		marks.put("Lisa", 50);
		marks.put("Peter", 20);
		marks.put("Robby", 40);
		marks.put("Robert", 80);
		marks.put("Ram", 70);

		System.out.println(marks.get("Tom"));
		System.out.println(marks.get("Robert"));
	}

}
