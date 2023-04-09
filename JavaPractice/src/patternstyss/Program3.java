package patternstyss;

public class Program3 {
	public static void main(String[] args) {
		
		int num=5;
		char ch='a';
		for (int i = 0; i <num; i++) {
			
			for (int j = 0; j < num; j++) {
				
				if(i>=j)
				{
					System.out.print((char)(ch++)+" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
