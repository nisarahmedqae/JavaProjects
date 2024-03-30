package javaCore;

public class StaticVar {
	// instance variables
	String name;
	String address;
	String city;

	public StaticVar(String name, String address, String city)
	// receiving parameter values from object method
	{
		this.name = name;
		this.address = address;
		this.city = city;

	}

	public void getAddress() {
		System.out.println(address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bob", "Marthalli", "Bangalore");
		// we are sending parameter values through object method to constructor class

		StaticVar obj2 = new StaticVar("Ram", "Jaynagar", "Bangalore");

		obj.getAddress();
		obj2.getAddress();

	}

}
