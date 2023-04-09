package collectionsPrograms;

import java.util.LinkedHashSet;

public class P3CharCount {

	public static void main(String[] args) {
		
		String s = "aabbdcdgaadbcdd";
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);
		//int fcount=0;
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
			System.out.println(ch+" "+count);
		}
		
//		if(count>1)
//		{
//			fcount++;
//		}
//		}
//		System.out.println(fcount);
	

}}
