package StringBased;

public class SortString {

	public static void main(String[] args) {
		String str = "defabcghi";
		char[] chArr = str.toCharArray();

		for (int i = 0; i < chArr.length; i++) {
			for (int j = i + 1; j < chArr.length; j++) {
				String s1 = chArr[i] + "";
				String s2 = chArr[j] + "";

				if (s1.compareTo(s2) > 0) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		System.out.println(chArr);

	}

}
