package strings;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		String s="im working in TestYantra";
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
	   for(int i=0;i<ch.length;i++)
	   {
		   System.out.println(ch[i]);
	   }

	}

}
