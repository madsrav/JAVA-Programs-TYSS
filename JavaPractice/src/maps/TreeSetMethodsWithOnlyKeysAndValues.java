package maps;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetMethodsWithOnlyKeysAndValues {

	public static void main(String[] args) {
		TreeMap<Integer, String> h = new TreeMap();
		h.put(1, "sky");
		h.put(2, "crugger");
		h.put(4, "jessika");
		h.put(4, "jenni");
		h.put(5, "hhg");
		System.out.println(h);

		Set<Integer> hmap = h.headMap(5).keySet();
		System.out.println(hmap);

		Collection<String> tmap = h.tailMap(1).values();
		System.out.println(tmap);

		Collection<String> desmap = h.descendingMap().values();
		System.out.println(desmap);

		Set<Integer> subm = h.subMap(1, 5).keySet();
		System.out.println(subm);

	}

}
