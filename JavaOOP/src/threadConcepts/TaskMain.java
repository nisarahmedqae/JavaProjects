package threadConcepts;

public class TaskMain {

	public static void main(String[] args) {
		// Create three tasks
		Task task1 = new Task("A");
		Task task2 = new Task("B");
		Task task3 = new Task("C");

		// Create threads for each task
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);

		// Start the threads
		thread1.start();
		thread2.start();
		thread3.start();

		// Wait for all threads to complete
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All tasks have completed.");
	}
}