package ProgrammingChallenge_Part2;

public class DiagonalSum2DArray {
	public static void main(String[] args) {

		int[][] numArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		long sum = sumOfDiagonals(numArr);

		System.out.println("Sum of diagonals is: " + sum);
	}

	public static long sumOfDiagonals(int[][] numArr) {
		long leftSum = sumOfLeftDiagonal(numArr);
		long rightSum = sumOfRightDiagonal(numArr);
		long sum = leftSum + rightSum;

		if (numArr.length % 2 != 0) {
			int ind = numArr.length / 2;
			sum -= numArr[ind][ind];
		}

		return sum;
	}

	public static long sumOfLeftDiagonal(int[][] numArr) {
		long sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i][i];
		}

		return sum;
	}

	public static long sumOfRightDiagonal(int[][] numArr) {
		long sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			int col = numArr.length - 1 - i;
			sum += numArr[i][col];
		}

		return sum;
	}
}
