package threadConcepts;

import java.util.concurrent.atomic.AtomicInteger;

public class UsingAtomicInteger {

	// Use Case: High-performance applications where non-blocking thread safety is
	// required for simple variables.

	private AtomicInteger count = new AtomicInteger(0);

	public void increment() {
		count.incrementAndGet();
	}

	public int getCount() {
		return count.get();
	}
}