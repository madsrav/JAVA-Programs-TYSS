package strings;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
	
		StringBuffer s=new StringBuffer("Test");
		StringBuffer s1=new StringBuffer("yantra");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.append(s1));
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.compareTo(s1));
	}
}
