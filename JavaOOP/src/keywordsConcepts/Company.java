package keywordsConcepts;

public class Company {

	// Accessing Superclass Variable

	protected String name = "Generic Company";
}

class TechCompany extends Company {
	protected String name = "Tech Innovators";

	public void printNames() {
		System.out.println(super.name); // Accesses the superclass (Company) name variable
		System.out.println(this.name); // Accesses the subclass (TechCompany) name variable
	}

	public static void main(String[] args) {
		TechCompany techCompany = new TechCompany();
		techCompany.printNames(); // Outputs: Generic Company\nTech Innovators
	}
}
