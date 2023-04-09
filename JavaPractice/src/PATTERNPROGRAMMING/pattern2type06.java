package PATTERNPROGRAMMING;

public class pattern2type06 {
	public static void main(String[] args) {
		int k=1;
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r>=c)
				{
				System.out.print(k+" ");
				k++;
				}
			}
			System.out.println();
		}
	}
}
