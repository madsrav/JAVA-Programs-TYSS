package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(38);
		s.add(25);
		s.add(12);
		s.add(12);
		s.add(25);
		s.add(42);

		System.out.println(s);
		// if we want to print the output line by line we need to use iterator() in set interface
		//but in list we will use listiterator().
		Iterator set = s.iterator();
		while(set.hasNext())
		{
			System.out.println(set.next());
		}

	}

}
