package collectionsPrograms;

import java.util.LinkedHashSet;

public class Program1 {

	public static void main(String[] args) {
		
		String s="abcddcbaacbddbca";
		LinkedHashSet<Character> lh=new LinkedHashSet<>();//here adding string into our collection
		for(int i=0;i<s.length();i++)

		{
			lh.add(s.charAt(i));
		}
		System.out.println(lh);
	
	 for(Character ch:lh)
	 {
		 for(int i=0;i<s.length();i++)
		 {
			 if(ch.equals(s.charAt(i)))//comparing all chracters of lh with ch and print the char
			 {
				 System.out.print(ch);
			 }
		 }
		 System.out.println();//take the cursor to next line
	 } 
	}
}