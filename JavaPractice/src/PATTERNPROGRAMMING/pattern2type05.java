package PATTERNPROGRAMMING;

public class pattern2type05 {
	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(c<=r)
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
