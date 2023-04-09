package maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> h=new TreeMap();
		h.put(1, "sky");
		h.put(2, "crugger");
		h.put(3, "jessika");
		h.put(4, "jenni");
		h.put(4, "dog");
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
		
		Set<Entry<Integer, String>> eSet = h.entrySet();
		Iterator<Entry<Integer, String>> values = eSet.iterator();
		while(values.hasNext())
		{
			System.out.println(values.next());
		}
		
		
	}

}
