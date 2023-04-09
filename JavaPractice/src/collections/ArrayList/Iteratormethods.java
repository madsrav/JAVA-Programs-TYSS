package collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Iteratormethods {
	public static void main(String[] args) {

		ArrayList a=new ArrayList();//here we are upcasting
		a.add(42);
		a.add(true);
		a.add('u');
		a.add(42);
		a.add(0, "rajan");
		a.add(null);
		System.out.println(a);

		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}


		for(Object list:a)
		{
			System.out.println(list);
		}

		System.out.println("using iterator");


		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}
