package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapOtherMethods {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h=new HashMap();
		h.put(1, "sky");
		h.put(2, "crugger");
		h.put(3, "jessika");
		h.put(4, "jenni");
		
		System.out.println(h);
		
		h.remove(2);
		System.out.println(h);
		
		Set<Integer> keys = h.keySet();
		
		for( Integer key:keys)
		{
			System.out.println(key);
		}
		
		System.out.println("printig values");
		Collection<String> val = h.values();
		Iterator<String> it = val.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("printinng entry set");
		
		Set<Entry<Integer, String>> es = h.entrySet();
		for(Entry<Integer, String> eSet:es)
		{
			System.out.println(eSet);
		}
		
	}

}
