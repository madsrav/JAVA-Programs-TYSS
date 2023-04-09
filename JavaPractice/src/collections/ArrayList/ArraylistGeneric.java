package collections.ArrayList;

import java.util.ArrayList;

public class ArraylistGeneric {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		/* if we want only specific data type of output \
		 * we need to use angular braces and 
		 * wrapper class type*/
		a.add(42);
		a.add(78);
		a.add(89);
		a.add(0,96);
		a.add(null);
		System.out.println(a);
		a.clear();//it will clear the entire collection
		System.out.println(a);
	}
}
