package ProgrammingChallenge_Part2;

public class IsSortedStringArray {

	public static void main(String[] args) {
		String[] strArr = { "apple", "banana", "cherry" };

		boolean isInc = isIncreasing(strArr);
		boolean isDec = isDecreasing(strArr);

		if (isInc || isDec) {
			System.out.println("Your array is sorted");
		} else {
			System.out.println("Your array is not sorted");
		}
	}

	public static boolean isIncreasing(String[] strArr) {
		for (int i = 0; i < strArr.length - 1; i++) {
			if (strArr[i].compareTo(strArr[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(String[] strArr) {
		for (int i = 0; i < strArr.length - 1; i++) {
			if (strArr[i].compareTo(strArr[i + 1]) < 0) {
				return false;
			}
		}
		return true;
	}
}