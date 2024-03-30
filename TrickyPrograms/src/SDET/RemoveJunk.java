package SDET;

public class RemoveJunk {

	public static void main(String[] args) {
		String str = "!#$@$%#%&^*^& latin string 0123456789";
		str = str.replaceAll("[^a-zA-Z0-9]", ""); // removing through regular expression
		System.out.println(str);
		
		String str2 = "@$%$^&%* testing @$%$^&%* selenium @$%$^&%* java";
		str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
	}

}
