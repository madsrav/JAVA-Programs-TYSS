package maps;

import java.util.Hashtable;

public class HashTableGeneric {

	public static void main(String[] args) {
		// it not allows duplicate keys
		//it is thread safe and syncronising
		Hashtable<Integer, String> t=new Hashtable<>();
		t.put(1, "sky");
		t.put(2, "crugger");
		t.put(5, "hhgh");
		t.put(4, "cat");
		
		System.out.println(t);
			
	}

}
