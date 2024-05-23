package stringConstantPool;

public class StringPoolIntern {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = str1.intern();

		// str2 now points to the interned string in the pool
		System.out.println(str1 == str2); // Output: false
		System.out.println("Hello" == str2); // Output: true
	}
}