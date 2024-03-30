package ProgrammingChallenge_Part2;

public class StudentScoreTernary {

	public static void main(String[] args) {
		int marks = 30;

		String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
		System.out.println("Your category is: " + category);
	}
}