package collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueMethods {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		
		p.add(25);
		p.offer(21);
		p.add(65);
		p.add(94);
		
		System.out.println(p);
		
		System.out.println(p.peek());
		p.poll();
		System.out.println(p);
		
		while(!p.isEmpty())
		{
			p.poll();
		}
		
System.out.println(p);
	}

}
