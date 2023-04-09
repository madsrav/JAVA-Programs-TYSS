package collectionsPrograms;

import java.util.LinkedHashSet;

public class P12DuplicateCharPosition {
	
public static void main(String[] args) {
		
		String s = "tester";
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);
		for(Character ch:lh)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					System.out.println(ch+" position is "+(i+1));
				
				}
			}
		}
		
	}

}
