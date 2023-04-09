package PATTERNPROGRAMMING;

public class pattern1type02 {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1||r==3) //(c%2!=0)
				    System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

}
