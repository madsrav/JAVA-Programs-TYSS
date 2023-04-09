package strings;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String s="iam working in TestYantra";
		String[] s2 = s.split(" ");
		System.out.println(Arrays.toString(s2));
	    for(int i=0;i<s2.length;i++)
	    {
	    	System.out.println(s2[i]);
	    }

	}

}
