package stringPrograms;
import java.util.Arrays;
public class P19Anagrams {
	public static void main(String[] args) {
		
		String s="race";
		String s1="care";
		
		if(s.length()==s1.length())
		{
			char[] charr1 = s.toCharArray();
			char[] charr2 = s1.toCharArray();
			Arrays.sort(charr1);
			Arrays.sort(charr2);
			//boolean result =Arrays.equals(charr1, charr2) ;
			if(Arrays.equals(charr1, charr2))
			{
				System.out.println(s+" and "+s1+" are anagrams");
			}
			else
			{
				System.out.println(s+" and "+s1+" are not an anagrams");
			}	
		}
		else
		{
			System.out.println(s+" and "+s1+" are non anagrams");
		}
	}

}
