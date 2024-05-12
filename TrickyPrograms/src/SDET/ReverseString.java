package SDET;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String

		// Approach 2
		String str = "ABCD";
		String temp = "";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			temp = temp + ch[i];
		}
		System.out.println(temp);

		// Approach 2
		String str2 = "ABCD";
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer revSb = sb.reverse();
		System.out.println(revSb);
	}

}
