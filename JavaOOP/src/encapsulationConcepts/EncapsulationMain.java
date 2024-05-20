package encapsulationConcepts;

public class EncapsulationMain {

	public static void main(String[] args) {
		// Creating a Person object
		Person person = new Person("John Doe", 25);

		// Accessing the person's data through public methods
		System.out.println("Initial Information:");
		person.displayInfo();

		// Modifying the person's data through setter methods
		person.setName("Jane Doe");
		person.setAge(30);

		System.out.println("Updated Information:");
		person.displayInfo();

		// Trying to set an invalid age
		person.setAge(-5); // Will not change the age due to validation in the setter method
		System.out.println("After Invalid Age Update:");
		person.displayInfo();
	}
}