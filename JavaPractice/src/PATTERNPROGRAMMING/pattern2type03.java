package PATTERNPROGRAMMING;

public class pattern2type03 {
	public static void main(String[] args) {
		int k=1;
		for(int r=1;r<=3;r++) // no of rows--->outerloop
		{
			for(int c=1;c<=3;c++) // no of columns--->innerloop
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
