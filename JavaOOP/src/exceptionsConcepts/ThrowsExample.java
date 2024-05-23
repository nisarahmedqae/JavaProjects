package exceptionsConcepts;

import java.io.IOException;

public class ThrowsExample {
	
    public static void main(String[] args) throws IOException {
        // Method with throws clause
        readFile("example.txt");
    }
    
    public static void readFile(String fileName) throws IOException {
        // Method that declares IOException may be thrown
        // Code to read file
    }
}
