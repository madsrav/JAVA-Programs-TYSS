package PATTERNPROGRAMMING;

public class pattern4type06 {
	public static void main(String[] args) {
	    int star=1,space=3;
	    for(int i=1;i<=7;i++)
	    {
	    	for(int j=1;j<=space;j++)
	    	{
	          System.out.print(" ");
	    	}
	    	for(int k=1;k<=star;k++)
	    	{
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println();
	    	if(i<4) {
	    	star = star+1;
	    	space=space-1;
	    	}
	    	else
	    	{
	    	star=star-1;
	    	space=space+1;
	    	}
	    }

	}

}
