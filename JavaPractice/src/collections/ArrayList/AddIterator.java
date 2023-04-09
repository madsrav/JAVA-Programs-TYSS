package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddIterator {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();// here we are upcasting
		a.add(42);
		a.add(26);
		a.add(38);
		a.add(42);
		a.add(0, 24);
		a.set(0, 49);


		ListIterator li = a.listIterator();
		while (li.hasNext())
		{
			Object re = li.next();

			if (re.equals(26))
			{
				li.add(29);
			}
		}
		System.out.println(a);
	
	}
}
