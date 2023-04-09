package mockpractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Program3 {

	public static void main(String[] args) {

		String s="javatestr";
		int count=0;
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if(s1.indexOf(ch)==-1)
			{
			
			s1=s1+ch;
		}
	
		}
	
	
		for (int i = 0; i < s1.length(); i++) {
	
			char ch=s.charAt(i);
			
			if(ch=='e'||ch=='a')
			{
				count++;
			}
		}
		System.out.println(""+count);
	
	
	}
}
