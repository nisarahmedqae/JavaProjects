package javaCore;

public class StaticVar2 {
	// instance variables
	String name;
	String address;
	static String city = "Bangalore"; // class variable

	// we can use block to define multiple static variables at once
	/*
	 * static { city = "Bangalore"; i = 0; }
	 */

	// int i = 0; //instance variable
	// on every iteration value of i will be taken freshly
	static int i = 0; // class variable
	// due to static it will remember last value of i and will iterate over last
	// value

	public StaticVar2(String name, String address)
	// receiving parameter values from object method
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity()
	// static method will only accept static variable
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar2 obj = new StaticVar2("Bob", "Marthalli");
		// we are sending parameter values through object method to constructor class

		StaticVar2 obj2 = new StaticVar2("Ram", "Jaynagar");

		obj.getAddress();
		obj2.getAddress();
		StaticVar2.getCity(); // static methods can directly be called with class.methodName as they are
								// object independent
		StaticVar2.i = 4; // we can also assign value to static variables with className
		obj.address = "Hyderabad"; // for non-static variable we can only assign value with object
	}

}
