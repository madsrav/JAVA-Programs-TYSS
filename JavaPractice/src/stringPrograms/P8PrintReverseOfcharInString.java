package stringPrograms;

public class P8PrintReverseOfcharInString {

	public static void main(String[] args) {

		String s = "im in testyantra";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			String rev = "";//here we are making local due to reinitialise rev

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				rev = ch + rev;
			}

			System.out.print(rev + " ");

		}

	}

}
