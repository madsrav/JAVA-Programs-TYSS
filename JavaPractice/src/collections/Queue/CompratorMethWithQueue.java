package collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CompratorMethWithQueue implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Integer i1=(Integer)o1;
			Integer i2=(Integer)o2;
	
			if(i1>i2)
			{
				return 1;
			}
			else if(i1<i2)
			{
				return -1;
	
			}
			return 0;
		}
		public static void main(String[] args) {
			//here in queue it wont support sort().so we have inbuilt consturctor to sort
			Queue al=new PriorityQueue(new CompratorMethWithQueue());
			al.add(25);
			al.add(38);
			al.add(4);
			al.add(9);
			
			System.out.println(al);
	}

}
