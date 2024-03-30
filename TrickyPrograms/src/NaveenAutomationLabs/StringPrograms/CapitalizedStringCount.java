package NaveenAutomationLabs.StringPrograms;

public class CapitalizedStringCount {

	public static void main(String[] args) {
		// get the count of total words in a given capitalized string

		String str = "NaveenAutomationLabsYoutube";
		int count = 0;
		for (char s : str.toCharArray()) {
			if (Character.isUpperCase(s)) {
				count++;
			}
		}
		System.out.println("Number of uppercase characters: " + count);

		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count2++;
			}
		}
		System.out.println("Number of uppercase characters: " + count2);

		// streams
		long count4 = str.chars().filter(e -> e >= 'A' && e <= 'Z').count();
		System.out.println("Number of uppercase characters: " + count4);

		// streams
		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println("Number of uppercase characters: " + count5);

		long count6 = str.chars().filter(e -> Character.isLowerCase(e)).count();
		System.out.println("Number of lowercase characters: " + count6);
	}

}
