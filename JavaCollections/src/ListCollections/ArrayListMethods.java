package ListCollections;

import java.util.ArrayList;

public class ArrayListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("dev ops");

		// ar1.addAll(ar2);
		System.out.println(ar1);

		ar1.addAll(2, ar2);
		System.out.println(ar1);

		// ar1.clear();
		System.out.println(ar1);

		// cloning an ArrayList
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);

		System.out.println(cloneList.contains("python"));
		System.out.println(cloneList.indexOf("python"));
		System.out.println(cloneList.indexOf("python") > 0);
	}

}
