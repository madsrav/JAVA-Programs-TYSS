package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {

	public static void main(String[] args) {
		
		LinkedHashSet s= new LinkedHashSet();
		s.add("hghgfhss");
		s.add(25);
		s.add(null);
		s.add(null);
		s.add(25);
		s.add('c');

		System.out.println(s);

		Iterator set = s.iterator();
		while(set.hasNext())
		{
			System.out.println(set.next());
		}
		
		
	}

}
