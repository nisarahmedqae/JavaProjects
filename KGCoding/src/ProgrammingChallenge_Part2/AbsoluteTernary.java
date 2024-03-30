package ProgrammingChallenge_Part2;

public class AbsoluteTernary {

	public static void main(String[] args) {
		int num = -2;
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}