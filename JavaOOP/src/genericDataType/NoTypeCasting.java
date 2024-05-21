package genericDataType;

import java.util.ArrayList;
import java.util.List;

public class NoTypeCasting {

	public static void main(String[] args) {
		// Without Generics:
		List list1 = new ArrayList();
		list1.add("Hello");
		String str1 = (String) list1.get(0); // Type casting is required

		// With Generics:
		List<String> list2 = new ArrayList<>();
		list2.add("Hello");
		String str2 = list2.get(0); // No type casting required

	}

}
