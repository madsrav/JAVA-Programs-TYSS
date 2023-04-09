package patternstyss;

public class Program1 {

	public static void main(String[] args) {
		
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+j));	
				}
			}
			System.out.println();
		}
		

	}

}
