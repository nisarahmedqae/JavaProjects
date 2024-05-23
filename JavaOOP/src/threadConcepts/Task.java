package threadConcepts;

public class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task " + name + " is executing step " + i);
			try {
				Thread.sleep(1000); // Simulate some work being done
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task " + name + " has completed.");
	}
}
