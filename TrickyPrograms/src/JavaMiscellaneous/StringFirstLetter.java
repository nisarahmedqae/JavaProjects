package JavaMiscellaneous;

public class StringFirstLetter {

	public static void main(String[] args) {
		// wap to print first letter of each word in the string

		String str1 = "I like java and automation";
		String[] str2 = str1.split(" ");
		
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i].charAt(0));
		}

	}

}
