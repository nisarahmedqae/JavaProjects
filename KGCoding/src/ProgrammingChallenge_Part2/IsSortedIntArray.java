package ProgrammingChallenge_Part2;

public class IsSortedIntArray {

	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3 };

		boolean isInc = isIncreasing(numArr);
		boolean isDec = isDecreasing(numArr);

		if (isInc || isDec) {
			System.out.println("Your array is sorted");
		} else {
			System.out.println("Your array is not sorted");
		}
	}

	public static boolean isIncreasing(int[] numArr) {
		for (int i = 0; i < numArr.length - 1; i++) {
			if (numArr[i] > numArr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(int[] numArr) {
		for (int i = 0; i < numArr.length - 1; i++) {
			if (numArr[i] < numArr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}