package PATTERNPROGRAMMING;

public class pattern3type04 {

	public static void main(String[] args) {
		
		for(char r='A';r<='C';r++)
		{
			for(char c='A';c<='C';c++)
			{
				if(r>=c)
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
