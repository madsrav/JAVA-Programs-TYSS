package strings;

public class IndexOf {

	public static void main(String[] args) {
		String s="TestyantraTest";
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("traT"));
		System.out.println(s.indexOf('y', 3));
		System.out.println(s.indexOf("Test", 0));	
	}

}
