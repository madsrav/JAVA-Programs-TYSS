package collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethods {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();// here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(42);
		a.add(0, "rajan");

		ListIterator li = a.listIterator();
		
		/*Iterator will move from first to last*/
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("printing backward");
		
		/*list iterator has move from last to first*/
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}
}
