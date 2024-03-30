package javaBasics;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 4; i++) // outer loop
		{
			System.out.println("outer loop started");

			for (int j = 0; j <= 4; j++) // inner loop
			{
				System.out.println("inner loop");

			}

			System.out.println("outer loop finished");
		}

	}

}
