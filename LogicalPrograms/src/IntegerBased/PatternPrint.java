package IntegerBased;

import java.util.Arrays;

public class PatternPrint {

	public static void main(String[] args) {

		int[][] pattern = new int[4][4];

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == j) {
					pattern[i][j] = i + 1;
				} else if (j == 3) {
					pattern[i][j] = i + 1;
				} else {
					pattern[i][j] = 0;
				}
			}
		}
		for (int[] r : pattern) {
			System.out.println(Arrays.toString(r));
		}
	}
}