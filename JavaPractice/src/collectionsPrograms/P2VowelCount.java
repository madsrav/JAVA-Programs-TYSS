package collectionsPrograms;

import java.util.LinkedHashSet;

public class P2VowelCount {
	
	public static void main(String[] args) {
		int count = 0;
		String s="india";
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
		System.out.println(lh);
		for(Character ch:lh)
		{
				if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
				{
					
					count++;
				}
			
		}
		System.out.println(s+" vowelcount is "+count);
	}
}
