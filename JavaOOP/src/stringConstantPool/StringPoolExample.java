package stringConstantPool;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        // str1 and str2 point to the same object in the pool
        System.out.println(str1 == str2);  // Output: true
    }
}
