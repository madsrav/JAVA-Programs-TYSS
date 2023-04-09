package collections.Queue;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMethods implements Comparator{

	
/*here in comparator intrface we have compare() to compare two objects
 * we can use normal wrapper classes instead of class object
 * but use sort() with comparator
 */
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1=(Integer)o1;
//		Integer i2=(Integer)o2;
//
//		if(i1>i2)
//		{
//			return -1;
//		}
//		else if(i1<i2)
//		{
//			return 1;
//
//		}
//		return 0;
//	}
//	public static void main(String[] args) {
//
//		ArrayList al=new ArrayList();
//		al.add(25);
//		al.add(38);
//		al.add(42);
//		al.add(99);
//		
//		Collections.sort(al, new ComparatorMethods());
//		System.out.println(al);
	
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		if(s1.compareTo(s2)<0)
		{
		return 1;
		}
		
		else if(s1.compareTo(s2)>0)
		{
			return -1;	
		}
	      return 0;
		}
	public static void main(String[] args) {
		//here dec/asc order will check ascii values
		// sort() will work with only list and it wont work with queue
				ArrayList al=new ArrayList();
				al.add("vinay");
				al.add("raju");
				al.add("suresh");
				al.add("sagar");
				
				Collections.sort(al, new ComparatorMethods());
				System.out.println(al);
	}
}
