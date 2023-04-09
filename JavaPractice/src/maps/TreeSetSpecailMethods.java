package maps;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeSetSpecailMethods {

	
	public static void main(String[] args) {
		TreeMap<Integer, String> h=new TreeMap();
		h.put(1, "sky");
		h.put(2, "crugger");
		h.put(4, "jessika");
		h.put(4, "jenni");
		h.put(5, "hhg");
		System.out.println(h);
		
		System.out.println(h.firstKey());
		System.out.println(h.lastKey());
		System.out.println(h.lastEntry());
		System.out.println(h.firstEntry());
		
		SortedMap<Integer, String> hmap = h.headMap(5);
		System.out.println(hmap);
		
		SortedMap<Integer, String> tmap = h.tailMap(1);
		System.out.println(tmap);
		
		NavigableMap<Integer, String> desmap = h.descendingMap();
		System.out.println(desmap);
		
		NavigableSet<Integer> deskey = h.descendingKeySet();
		System.out.println(deskey);

		SortedMap<Integer, String> subm = h.subMap(1, 5);	
		System.out.println(subm);
		
				
	}

}
