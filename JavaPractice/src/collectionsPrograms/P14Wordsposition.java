package collectionsPrograms;

import java.util.LinkedHashSet;

public class P14Wordsposition {
	
public static void main(String[] args) {
		
		String s = "khatam ta ta bye bye";
		String[] str = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		for (int i = 0; i<str.length; i++) {
			lh.add(str[i]);
		}
		System.out.println(lh);
		for(String ch:lh)
		{
			for(int i=0;i<str.length;i++)
			{
				if(ch.equals(str[i]))
				{
					System.out.println(ch+" position is "+(i+1));
				}
			}
		}	
}
}
