package NaveenAutomationLabs.StringPrograms;

public class StringLength {

	public static void main(String[] args) {
		// How to find length of string in java without using length method

		String str = "testing";

		System.out.println(str.length()); //length method
		
		System.out.println(str.toCharArray().length); //length variable
		System.out.println(str.lastIndexOf(""));
		System.out.println(str.split("").length);

		int count = 0;
		for (char ch : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
