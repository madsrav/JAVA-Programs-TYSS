package stringPrograms;

public class P1CountParticularCharOfstring {

	public static void main(String[] args) {
		int count = 0;
		String s = "javatester";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e') {

				count++;
			}
		}
		System.out.println(count+" of a & e");
	}
}
