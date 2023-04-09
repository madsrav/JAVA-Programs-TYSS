package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayOtherMethods {
	public static void main(String[] args) {
		List a=new ArrayList();//here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(0, "rajan");
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		
		ArrayList al = new ArrayList();
		al.add("raju");
		al.add(24.9);
		al.add(true);
		al.add('u');
		System.out.println(al.removeAll(a));
		/*here removeall method removes the common elements 
		 * from al collection
		*/
		System.out.println(al);
		System.out.println(a);
	}

}
