package collections.Queue;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator implements Comparable<Object> {

	int id;
	String name;
	int salary;

	public ComparableAndComparator(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

	@Override
	public int compareTo(Object o) {

		ComparableAndComparator e = (ComparableAndComparator) o;
		if (id < e.id) {
			return 1;
		} else if (id > e.id) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add(new ComparableAndComparator(1021, "john", 65000));
		al.add(new ComparableAndComparator(1022, "ragam", 600));
		al.add(new ComparableAndComparator(1023, "joseph", 75000));
		al.add(new ComparableAndComparator(1024, "jenni", 5000));
		System.out.println(al);

		Collections.sort(al);
       System.out.println("sorting based on id desc order");
		for (Object list : al) {
			System.out.println(list);

		}

		Collections.sort(al, new MySalaryComparator());

		System.out.println("sorting based on salary");
		for( Object salarylist:al)
		{
			System.out.println(" "+salarylist);	
		}

		Collections.sort(al, new MyNameComparator());

		System.out.println("sorting based on name");
		for( Object namelist:al)
		{
			System.out.println(namelist);	
		}

	}

}
