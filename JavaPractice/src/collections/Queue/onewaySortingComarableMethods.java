package collections.Queue;

import java.util.ArrayList;
import java.util.Collections;

public class onewaySortingComarableMethods implements Comparable {
  /*if we try with compare to and sort() we will get ascending order 
   * if we want do it in descending order we need to follow this method
   */
	int num;
	onewaySortingComarableMethods(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "num=" + num;
	}
	@Override
	public int compareTo(Object o) {
		onewaySortingComarableMethods s = (onewaySortingComarableMethods) o;
		if (num < s.num) {
			return -1;
		} else if (num > s.num) {
			return 1;
		}
		    return 0;
	}
	public static void main(String[] args) {

		ArrayList p = new ArrayList();
		p.add(new onewaySortingComarableMethods(15));
		p.add(new onewaySortingComarableMethods(2));
		p.add(new onewaySortingComarableMethods(67));
		p.add(new onewaySortingComarableMethods(64));

		System.out.println(p);
		Collections.sort(p);
		System.out.println(p);
	}
}
