package ProgrammingChallenge_Part1;

public class CompoundInterest {

	public static void main(String[] args) {
		int principle = 2000;
		float rate = 4;
		float years = 3;

		double compInt = principle * Math.pow((1 + rate / 100), years);
		System.out.println("Your compound interest is Rs: " + compInt);

	}

}
