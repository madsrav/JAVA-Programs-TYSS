package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3rdConstructor {

	public static void main(String[] args) {
		List a=new ArrayList();//here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(0, "rajan");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		
		ArrayList al = new ArrayList();
		al.addAll(a);
		al.add(a);//here it is consider the parameter as object not as collection
		al.add("raju");
		al.add(24.9);
		System.out.println(al);

	}

}
