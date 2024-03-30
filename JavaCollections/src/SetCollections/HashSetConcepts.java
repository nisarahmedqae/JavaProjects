package SetCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// it does not maintain any order
		// does not accept duplicate values

		Set<String> hs = new HashSet<String>();
		hs.add("alpha");
		hs.add("testing");
		hs.add("beta");
		hs.add("alpha");
		hs.add("alpha");
		hs.add("alpha");
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.contains("alpha"));

		System.out.println("---------for each--------------");
		for (String e : hs) {
			System.out.println(e);
		}

		System.out.println(hs.remove("beta"));
		System.out.println(hs);

		System.out.println("---------iterator--------------");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
