package collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		//if we want to print output in desc order we need to create object of class
		//and we need implement the comparator abstract methods 
     Integer i1=(Integer)o1;
     Integer i2=(Integer)o2;
     
     if(i1>i2)
     {
    	 return -1;
     }
     else if(i1<i2)
     {
    	 return 1;
     }
		return 0;
	}
	public static void main(String[] args) {
		TreeSetWithComparator t=new TreeSetWithComparator();
		TreeSet<Integer> s=new TreeSet<Integer>(t);
		s.add(38);
		s.add(25);
		s.add(12);
		s.add(12);
		s.add(25);
		s.add(42);

		System.out.println(s);//normally will give output in ascending order
	}	
}
