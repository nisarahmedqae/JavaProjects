package ProgrammingChallenge_Part2;

public class StringManipulation {

	public static void main(String[] args) {
		String firstName = "Prashant";
		String lasName = "Jain";
		String fullName = firstName.concat(" " + lasName);
		System.out.println(fullName.toUpperCase());
	}
}