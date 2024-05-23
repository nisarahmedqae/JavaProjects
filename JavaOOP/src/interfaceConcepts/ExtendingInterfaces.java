package interfaceConcepts;

//Interface can extend one or more other interfaces. H
//However, an interface cannot implement other interfaces; it can only extend them.
interface ParentInterface {
	void parentMethod();
}

interface ChildInterface extends ParentInterface {
	void childMethod();
}

public class ExtendingInterfaces implements ChildInterface {
	public void parentMethod() {
		System.out.println("Implemented parent method");
	}

	public void childMethod() {
		System.out.println("Implemented child method");
	}
}
