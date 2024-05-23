package keywordsConcepts;

public class Person {

	// Returning the Current Instance

	private String name;
	private int age;

	public Person setName(String name) {
		this.name = name;
		return this; // Returns the current instance
	}

	public Person setAge(int age) {
		this.age = age;
		return this; // Returns the current instance
	}

	public void printDetails() {
		System.out.println("Name: " + this.name + ", Age: " + this.age);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Alice").setAge(28).printDetails(); // Outputs: Name: Alice, Age: 28
	}
}
