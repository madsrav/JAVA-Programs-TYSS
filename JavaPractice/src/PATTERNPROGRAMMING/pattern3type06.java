package PATTERNPROGRAMMING;

public class pattern3type06 {

	public static void main(String[] args) {
		char k='A';
		for(char r='A';r<='C';r++)
		{
			for(char c='A';c<='C';c++)
			{
				if(r>=c)
				{
				System.out.print(k+" ");
				k++;
			}}
			System.out.println();
		}
	}

}
