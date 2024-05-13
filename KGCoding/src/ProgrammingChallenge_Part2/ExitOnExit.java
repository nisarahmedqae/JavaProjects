package ProgrammingChallenge_Part2;

import java.util.Scanner;

public class ExitOnExit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your command: ");
			String command = input.next();

			if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		System.out.println("You have successfully exited.");
	}
}