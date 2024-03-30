package javaCore;

//one try can be followed by multiple catch blocks
//catch should be an immediate block after try
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 7;
		int c = 0;

		try {
			// int k = b/c;
			// System.out.println(k);

			int arr[] = new int[5];
			System.out.println(arr[7]);
		} catch (ArithmeticException ae) {
			System.out.println("I catched the Arithmetic Exception");
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("I catched the Index Out Of Bounds Exception");
			System.out.println(ioobe);
		} catch (Exception e) {
			System.out.println("I catched the error/exception");
		} finally {
			// This block will be executed irrespective of error thrown or not
			System.out.println("delete cookies");
			// catch and finally block can only be executed after try block
		}

	}

}
