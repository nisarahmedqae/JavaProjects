package ProgrammingChallenge_Part1;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2024;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Your year is a leap year");
		} else {
			System.out.println("Your year is not a leap year");
		}

	}

}
