package collctions.LinkedListAndVector;

import java.util.LinkedList;

public class LinkedlistMethods {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("ios");
		ll.add(true);
		ll.add("android");
		ll.add("windows");
		ll.add("blackberry");
		System.out.println(ll);
		ll.addFirst("microsoft");
		System.out.println(ll);
		ll.addLast("google");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
	}

}
