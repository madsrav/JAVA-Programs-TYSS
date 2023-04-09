package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsInCollectionsClass {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(42);
		a.add(26);
		a.add(38);
		a.add(42);
		a.add(0, 24);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
	    Collections.swap(a, 2, 0);
	    System.out.println(a);
	}

}
