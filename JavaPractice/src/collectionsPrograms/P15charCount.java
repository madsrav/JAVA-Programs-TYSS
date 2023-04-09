package collectionsPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class P15charCount {

	public static void main(String[] args) {
		
		String s="automation";
		
		HashMap<Character, Integer> hs = new HashMap<>();
		for(int i=0;i<s.length();i++) {
//			int count=1;
//			if(hs.containsKey(s.charAt(i))==false)
//			{
//				hs.put(s.charAt(i), count);
//				
//			}
//			else
//			{	
//				count++;
//				hs.put(s.charAt(i),count);
//			}
			if(hs.containsKey(s.charAt(i))==false)
			{
				hs.put(s.charAt(i), 1);
				
			}
		
			else
			{
				Integer oldval = hs.get(s.charAt(i));
				int newval = oldval+1;
				hs.put(s.charAt(i), newval);
			}
		}
		System.out.println(hs);
		Set<Character> ks = hs.keySet();
		for( Character kset:ks)
		{
			System.out.println(kset);
		}
		
		Set<Entry<Character, Integer>> es = hs.entrySet();
		for(Entry<Character, Integer> Eset:es)
		{
			System.out.println(Eset);
		}

	}

}
