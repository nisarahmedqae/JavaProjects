package JavaMiscellaneous;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// WebDriver driver = new ChromeDriver();
		// This means im creating an object of ChromeDriver class
		// To implement methods present in WebDriver class
		// Bcoz ChromeDriver implementing WebDriver interface in its class
		
		// Even though method body is defined in ChromeDriver class but we are using
		// Methods of WebDriver Interface which is implemented in ChromeDriver class
		
		// Also Variables defined in interface class are public in nature by default
		
		// public class ChromeDriver implements WebDriver
		// WebDriver driver = new ChromeDriver(); -> In this we can only use methods of WebDriver
		// ChromeDriver driver = new ChromeDriver(); -> In this we can only use methods of ChromeDriver
		
		// One class can implement multiple interfaces
		// public class ChromeDriver implements WebDriver, MobDriver
		// MobDriver driver = new ChromeDriver(); -> In this we can only use methods of MobDriver
	}

}
