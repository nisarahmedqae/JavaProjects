package StringBased;

public class ReverseWordsKeepingSpacesIntact {

	public static void main(String[] args) {

		String str = "Welcome to java";
		char[] arr = str.toCharArray();
		char[] result = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = result.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				while (result[j] == ' ') {
					j--;
				}
				result[j] = arr[i];
				j--;
			}
		}
		System.out.println(result);
	}
}