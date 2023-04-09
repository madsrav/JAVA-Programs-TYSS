

package collectionsPrograms;

import java.util.LinkedHashSet;

public class P5PrintUniqueCharCOunt {

public static void main(String[] args) {
		
		String s = "indiaa";
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);
		
		for(Character ch:lh)
		{	
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			if(count==1)
			{
			System.out.println(ch+" "+count);
			}
		}	
}
}
