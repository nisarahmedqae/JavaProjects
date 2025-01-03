package Others;

import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		int num = 12345;
		rev(num);

		
	}
	
	public static void rev(int num) {
		int sum = 0;
		if(num >=0) {
			int lastDigit = num % 10;
			sum = sum * 10 + lastDigit;
			System.out.print(sum);
			rev( num/10);
		}
		
	}

}
