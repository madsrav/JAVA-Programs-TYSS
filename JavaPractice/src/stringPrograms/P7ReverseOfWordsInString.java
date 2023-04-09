package stringPrograms;

public class P7ReverseOfWordsInString {

	public static void main(String[] args) {

		String s = "im a test engineer";
		String[] split = s.split(" ");
		String rev = "";

		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			rev = str + " " + rev;
		}
		System.out.println(rev);
	}
}
