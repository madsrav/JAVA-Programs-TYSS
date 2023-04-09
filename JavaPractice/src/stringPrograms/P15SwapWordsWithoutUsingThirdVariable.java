package stringPrograms;

public class P15SwapWordsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String s="hyderabad";
		String s1="banglore";
		
		s=s+s1;//18
		s1=s.substring(0,s.length()-s1.length());//(0,18-9=9)
		s=s.substring(s1.length());//(9to17)
		System.out.println(s+" "+s1);
	}
}
