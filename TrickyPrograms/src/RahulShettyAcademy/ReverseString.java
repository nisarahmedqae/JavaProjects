package RahulShettyAcademy;

public class ReverseString {

	public static void main(String[] args) {
		// reverse the string without using Predefined reverse methods or Palindrome Verification
		// verify if string is Palindrome or not
		// Palindrome means string is same in both forward/reverse order like madam

		String str = "madam";
		String temp = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		System.out.println(temp);
		
		if(str.equals(temp)) {
			System.out.println("String is Palindrome");
		}
	}

}
