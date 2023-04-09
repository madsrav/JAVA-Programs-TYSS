package stringPrograms;

public class P3UniqueVowelsCount {

	public static void main(String[] args) {
		String s="automation";
		int vowelcount=0;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+ch;
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowelcount++;
			}
		}
		System.out.println(vowelcount);

	}
}

