package encapsulationConcepts;

public class Person {
	// Private variables - encapsulated data
	private String name;
	private int age;

	// Constructor to initialize the Person object
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Public getter method for name
	public String getName() {
		return name;
	}

	// Public setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Public getter method for age
	public int getAge() {
		return age;
	}

	// Public setter method for age
	public void setAge(int age) {
		if (age > 0) { // Validation logic
			this.age = age;
		}
	}

	// Method to display person information
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
