package CollectionsPractice;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Priority Queue --- it has offer, add, peek, poll , remove methods
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(2);
		PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<>(2);
		q.offer(2);
		q.offer(2);
		q.offer(2);
		q.offer(2);
		q.add(4);
		System.out.println(q);

	}

}
