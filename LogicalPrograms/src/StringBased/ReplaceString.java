package StringBased;

public class ReplaceString {

	public static void main(String[] args) {
		String name = "my name is khan";
		String[] splittedStr = name.split(" ");

		String blank = "";

		for (String ele : splittedStr) {
			String currentName = ele;
			if (currentName.equals("khan")) {
				currentName = "ahmed";
			}
			blank = blank + currentName + " ";
		}

		System.out.println(blank);

	}

}
