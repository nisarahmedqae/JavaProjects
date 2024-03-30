package NaveenAutomationLabs.IntegerPrograms;

public class StringToInteger {
	// WAP: write a program
	// wap to convert string to integer without using Integer.parseInt() method

	public static int stringToInt(String str) {
		char[] ch = str.toCharArray();
		int num = 0;
		int zeroAsc = (int) '0'; // This line calculates the ASCII value of the character '0'/zero i.e 48
		
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			num = num * 10 + (asc - zeroAsc);
		}
		return num;
	}


	public static void main(String[] args) {
		String s = "123";
		System.out.println(stringToInt(s) + 10);

	}

}
