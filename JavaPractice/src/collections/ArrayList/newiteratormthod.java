package collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class newiteratormthod {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();// here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(42);
		a.add(0, "rajan");
		//a.add(null);

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object re = it.next();
			if (re.equals(42)) {
				it.remove();
			}
		}
		System.out.println(a);
	}
}
