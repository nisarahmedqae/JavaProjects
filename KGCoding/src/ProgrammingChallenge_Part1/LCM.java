package ProgrammingChallenge_Part1;

public class LCM {
// Least Common Multiple

	public static void main(String[] args) {
		int first = 2;
		int second = 4;
		int lcm = lcm(first, second);
		System.out.println("LCM of the two numbers is: " + lcm);
	}

	public static int lcm(int first, int second) {
		for (int i = 1;; i++) {
			if (i % first == 0 && i % second == 0) {
				return i;
			}
		}
	}

}
