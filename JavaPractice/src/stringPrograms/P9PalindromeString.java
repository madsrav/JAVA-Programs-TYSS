package stringPrograms;

public class P9PalindromeString {

	public static void main(String[] args) {
		
		String s="level";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
			if(s.equals(rev))
			{
				System.out.println(s+" is a palindrome");
			}
			else
			{
				System.out.println(s+" is non palindrome");
			}
			
		}
		
	}