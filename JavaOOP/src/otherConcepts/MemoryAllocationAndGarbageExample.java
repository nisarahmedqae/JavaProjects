package otherConcepts;

public class MemoryAllocationAndGarbageExample {

	public static void main(String[] args) {

		// Memory allocation: Creating objects
		MyClass obj1 = new MyClass(1);
		MyClass obj2 = new MyClass(2);

		// Memory deallocation: Setting references to null
		obj1 = null;
		obj2 = null;

		// At this point, the objects are eligible for garbage collection
		// Garbage collection may reclaim the memory occupied by the objects

		// Optional: Explicitly invoke garbage collection (not recommended in production
		// code)
		System.gc();
	}
}

class MyClass {
	private int id;

	// Constructor
	public MyClass(int id) {
		this.id = id;
		System.out.println("Object " + id + " created.");
	}

	// Finalize method to perform cleanup actions before object is garbage collected
	@Override
	protected void finalize() throws Throwable {
		// Perform cleanup actions (e.g., release resources)
		System.out.println("Object " + id + " finalized and resources released.");

	}
}
