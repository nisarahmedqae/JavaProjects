package RahulShettyAcademy;
import java.util.ArrayList;

public class RepeatCount {

	public static void main(String[] args) {
		// print unique numbers from the array

		int[] arr = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (!arrList.contains(arr[i])) {
				arrList.add(arr[i]);
				count++;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println("" + arr[i] + " is repeated " + count + " tines");
			}
			
			if (count == 1) {
				System.out.println("Unique number is " + arr[i]);
			}
		}
	}

}
