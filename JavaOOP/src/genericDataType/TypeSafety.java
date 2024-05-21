package genericDataType;

import java.util.ArrayList;
import java.util.List;

// 1. Type Safety
public class TypeSafety {

	public static void main(String[] args) {
		// Without Generics:
		List list1 = new ArrayList();
		list1.add("Hello");
		list1.add(123); // No compile-time error, but potential runtime error

		String str1 = (String) list1.get(1); // Throws ClassCastException at runtime

		// With Generics:
		List<String> list2 = new ArrayList<>();
		list2.add("Hello");
		// list.add(123); // Compile-time error

		String str2 = list2.get(0); // No need for casting, safe and type-checked

	}

}
