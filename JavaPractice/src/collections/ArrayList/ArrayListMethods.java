package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List a=new ArrayList();//here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(42);
		a.add(0, "rajan");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains(true));
		System.out.println(a.indexOf(true));
		System.out.println(a.lastIndexOf(42));
		System.out.println(a.get(2));
		a.set(0, 100);
		System.out.println(a);
		a.set(0, "rajiiiiii");
		System.out.println(a);
	
	}

}
