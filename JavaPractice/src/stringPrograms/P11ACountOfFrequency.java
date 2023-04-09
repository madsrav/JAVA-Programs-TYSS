package stringPrograms;

public class P11ACountOfFrequency {

	public static void main(String[] args) {
		String s = "aaaaabccda";
		int fcount = 0;
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					i++;
				} else {
					break;
				}
			}
			System.out.println(s.charAt(i)+" "+count);
			if (count > 1) {
				fcount++;
			}
		}
		System.out.println(s+" "+fcount);
	}
}
