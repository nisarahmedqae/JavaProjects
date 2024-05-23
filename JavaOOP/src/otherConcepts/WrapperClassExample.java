package otherConcepts;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing and Unboxing
        Integer integerObject = 42;  // Autoboxing
        int primitiveInt = integerObject;  // Unboxing

        // Using utility methods
        int parsedInt = Integer.parseInt("123");
        String intString = Integer.toString(456);

        // Value methods
        Integer integerValue = Integer.valueOf(789);
        int intValue = integerValue.intValue();

        // Comparison methods
        Integer integer1 = 100;
        Integer integer2 = 200;
        int comparison = integer1.compareTo(integer2);
        boolean isEqual = integer1.equals(integer2);

        // Constants
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Using Wrapper class in Collections
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        // Output
        System.out.println("Integer object: " + integerObject);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Integer to String: " + intString);
        System.out.println("Integer value: " + integerValue);
        System.out.println("Primitive value from Integer: " + intValue);
        System.out.println("Comparison result: " + comparison);
        System.out.println("Equality result: " + isEqual);
        System.out.println("Max Integer: " + maxInt);
        System.out.println("Min Integer: " + minInt);
        System.out.println("Integer list: " + integerList);
    }
}
