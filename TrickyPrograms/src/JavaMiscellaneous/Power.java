package JavaMiscellaneous;

public class Power {

	public static void main(String[] args) {
		int num = 153;
		int oriNum = num;
		int count = 0;
		
		while (num != 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println("Power of " + oriNum + " is: " + count);
	}

}
