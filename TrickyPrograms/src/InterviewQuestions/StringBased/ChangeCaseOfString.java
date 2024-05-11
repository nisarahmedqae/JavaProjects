package InterviewQuestions.StringBased;

public class ChangeCaseOfString {

	public static void main(String[] args) {
		String name = "mynameiskhan";
		char[] charArr = name.toCharArray();

		String blank = "";

		for (int i = 0; i < charArr.length; i++) {
			char ch = charArr[i];

			if (ch >= 'a' && ch <= 'z' && i % 2 != 0) {
				ch = (char) (ch - ('a' - 'A'));
			} else if (ch >= 'A' && ch <= 'Z' && i % 2 == 0) {
				ch = (char) (ch + ('a' - 'A'));
			}

			blank = blank + ch;
		}

		System.out.println(blank);
	}

}
