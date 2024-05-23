package stringConstantPool;

public class StringPoolNewKeyword {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");

		// str1 and str2 do not point to the same object
		System.out.println(str1 == str2); // Output: false

		// Using intern() to get a reference from the pool
		String str3 = str2.intern();
		System.out.println(str1 == str3); // Output: true
	}
}
