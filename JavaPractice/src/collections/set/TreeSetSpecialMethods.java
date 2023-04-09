package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSpecialMethods {
	
	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(38);
		s.add(25);
		s.add(12);
		s.add(12);
		s.add(25);
		s.add(42);

		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		s.pollFirst();
		System.out.println(s);
		s.pollLast();
		System.out.println(s);

	}
}
