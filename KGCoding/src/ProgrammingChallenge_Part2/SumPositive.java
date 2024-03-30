package ProgrammingChallenge_Part2;

public class SumPositive {

	public static void main(String[] args) {
		int[] numArr = { 2, 4, -6, 8, -2 };

		int sum = 0;
		for (int num : numArr) {
			if (num < 0) {
				continue;
			}
			sum += num;
		}
		System.out.println("The sum of positive numbers is: " + sum);
	}
}