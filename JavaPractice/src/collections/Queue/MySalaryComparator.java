package collections.Queue;

import java.util.Comparator;

public class MySalaryComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		ComparableAndComparator e1=(ComparableAndComparator)o1;
		ComparableAndComparator e2=(ComparableAndComparator)o2;
		if(e1.salary>e2.salary)
		{
			return 1;
		}
		else if(e1.salary<e2.salary)
		{
			return -1;
		}
		return 0;
	}

}
