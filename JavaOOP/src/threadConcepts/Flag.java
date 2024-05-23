package threadConcepts;

public class Flag {

	// Use Case: Ensuring visibility of changes to variables across threads without
	// requiring full synchronization.

	private volatile boolean flag = true;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
