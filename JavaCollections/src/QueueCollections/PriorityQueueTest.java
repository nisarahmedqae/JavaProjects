package QueueCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	// insertion order preserved
	// duplicate values are allowed
	// heterogenios data is allowed in LinkedList

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(750);
		pq.add(900);
		pq.add(500);
		pq.add(100);
		pq.offer(100);

		System.out.println(pq.size());
		System.out.println(pq);

		// get head element
		System.out.println("--------------get head element------------");

		System.out.println(pq.element()); // if empty NoSuchElementException
		System.out.println(pq.peek()); // if empty returns null

		// return and remove element from queue
		System.out.println("--------------return and remove element from queue------------");

		System.out.println(pq.remove());
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);

		System.out.println("--------------iterate------------");
		Iterator<Integer> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
