package RahulShettyAcademy;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		// print NonRepeatingNumber from the array

		int[] arr = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		int NonRepeatingNumber = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					NonRepeatingNumber = arr[i];
				}
			}
		}
		System.out.println("Non repeating number is: " + NonRepeatingNumber);
	}

}
