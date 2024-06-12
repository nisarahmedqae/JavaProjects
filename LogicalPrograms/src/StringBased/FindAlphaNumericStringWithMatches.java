package StringBased;

import java.util.ArrayList;
import java.util.List;

public class FindAlphaNumericStringWithMatches {

    public static void main(String[] args) {
        String[] arr = { "hello1", "A", "123", "345", "2world" };

        // Pass it to the function that will return all alphanumeric elements
        List<String> elements = alphaNumeric(arr);
        System.out.println(elements);
    }

    public static List<String> alphaNumeric(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String element : arr) {
            // Check if the string contains both alphabetic and numeric characters using regex
            if (element.matches(".*[A-Za-z].*") && element.matches(".*[0-9]+.*")) {
                result.add(element);
            }
        }
        return result; // Return the list of alphanumeric strings
    }

}
