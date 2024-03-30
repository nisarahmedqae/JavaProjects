package javaBasics;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string literal (string is an object that represents sequence of characters)
		String n1 = "nisar ahmed";
		String n2 = "nisar ahmed";
		System.out.println(n1);
		System.out.println(n2);

		// string object
		String n3 = new String("rahul shetty academy");
		String[] splittedString = n3.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		String[] splittedString2 = n3.split("shetty");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);

		// removing spaces by applying trim function
		System.out.println(splittedString2[0].trim());
		System.out.println(splittedString2[1].trim());

		// checking character at index of string
		System.out.println("**********");
		for (int i = 0; i < n3.length(); i++) {
			System.out.println(n3.charAt(i));
		}

		// printing characters at reverse order
		System.out.println("**********");

		for (int i = n3.length() - 1; i >= 0; i--) {
			System.out.println(n3.charAt(i));
		}

	}

}
