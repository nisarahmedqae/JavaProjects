package javaCore;

public class AccessModifiers {

	int a1 = 5; // default variable
	public int a2 = 3; // public variable
	private int a3 = 7; // private variable
	protected int a4 = 7; // protected variable

	void abc() // Default: access method anywhere only in package
	{
		System.out.println("hello");
	}

	public void abc2() // Public: variable/method as public: then you will have access across all
						// packages
	{
		System.out.println("hello");
	}

	private void abc3() // Private: You can not access method or variable outside the class of same
						// package also
	{
		System.out.println("hello");
	}

	protected void abc4() // Protected: variable/method as protected :
	// you can access those in sub-class only through inheritance(extends) in other
	// packages also
	// same as default + extra feature
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
