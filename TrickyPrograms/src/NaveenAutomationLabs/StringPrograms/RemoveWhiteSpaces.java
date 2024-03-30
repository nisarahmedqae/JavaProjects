package NaveenAutomationLabs.StringPrograms;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// Remove all whitespaces from a string

		String newString = "   This   is my java code";
		System.out.println(newString.trim());

		String newString2 = "   This   is my java code";
		System.out.println(newString2.replaceAll("\\s", "")); // remove all white spaces

		String str = "   This   is my java code";
		String remString = StringUtils.deleteWhitespace(str);
		System.out.println(remString);

		System.out.println("---------------------------");
		String str2 = "   This   is my java code";
		String noWhiteSpaceString = "";

		for (char ch : str2.toCharArray()) {
			if (ch != ' ' && ch != '\t') {
				noWhiteSpaceString = noWhiteSpaceString + ch;
			}
		}
		System.out.println(noWhiteSpaceString);

		System.out.println("---------------------------");
		String str3 = "   This   is my java code";
		String[] splitStr3 = str3.split("\\s");
		StringBuffer stringBuffer = new StringBuffer();

		for (String e : splitStr3) {
			stringBuffer.append(e);
		}
		System.out.println(stringBuffer);
	}

}
