package collectionsPrograms;

import java.util.LinkedHashSet;

public class P10PrintString {

	public static void main(String[] args) {
		String s = "welcome to india welcome to tyss";
		String[] split = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		for (int i = 0; i < split.length; i++) {

			lh.add(split[i]);

		}
		System.out.println(lh);
		
		for(String ch:lh)
		{
		    System.out.print(ch+" ");
			}
		}
	}
		
	


