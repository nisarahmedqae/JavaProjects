package ProgrammingChallenge_Part1;

public class SimpleInterest {

	public static void main(String[] args) {
		int principle = 2000;
		float rate = 4;
		float years = 3;

		float interest = (principle * rate * years) / 100;
		System.out.println("Your Simple interest is Rs: " + interest);

	}

}
