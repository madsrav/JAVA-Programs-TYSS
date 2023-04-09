package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListMethods {

	public static void main(String[] args) {
		Queue q=new LinkedList(); // it is upcasting .it is beacuse linkedlist is extending
		                          //to queue and list ,so if we need only properties from queue ,we neeed to upcast.
		q.offer(42);
		q.add("hfhfgfh");
		q.add(true);
		q.offer(38);
		
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		System.out.println(q);

	}

}
