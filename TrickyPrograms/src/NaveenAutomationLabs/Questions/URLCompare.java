package NaveenAutomationLabs.Questions;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) throws MalformedURLException {
		// what will be the output when you compare site URL with its ip address
		
		System.out.println(new URL("https://demo.testfire.net").equals(new URL("https://65.61.137.117")));
	}

}
