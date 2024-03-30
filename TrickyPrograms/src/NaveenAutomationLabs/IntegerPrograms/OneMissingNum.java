package NaveenAutomationLabs.IntegerPrograms;

public class OneMissingNum {

	public static void main(String[] args) {
		// Find out the missing element in an integer array

		int[] arr = { 1, 2, 3, 5 }; // 1 to 5 will be 5
		int sum = 0;

		// formula=n(n+1)/2
		int n = arr.length + 1; // 1 is missing so adding 1
		int expSum = n * ((n + 1) / 2);

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Missing num = " + (expSum - sum));
	}

}
