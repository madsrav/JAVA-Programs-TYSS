package maps;

import java.util.HashMap;

public class HashmapMethods {

	public static void main(String[] args) {
		/*is it not thread safe and not sync
		 * allows only one duplicate key
		 */
		
		HashMap t=new HashMap();
		t.put(1, "sky");
		t.put(2, "crugger");
		t.put(5, "hhgh");
		t.put(4, "cat");
		t.put(null, "t");
		t.put(5, null);
		System.out.println(t);

	}

}
