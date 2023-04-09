package collectionsPrograms;

import java.util.LinkedHashSet;

public class P6printUniquewithoutcount {

	public static void main(String[] args) {

		String s = "india";
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);

		for (Character ch : lh) {
			System.out.print(ch);
		}
	}
}
