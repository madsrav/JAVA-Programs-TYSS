package patternstyss;

public class Program1num {

	public static void main(String[] args) {
		int num=5;
		int k=0;
		
		for (int i = 0; i <num; i++) {
			for (int j = 0; j <num; j++) {
				if(i>=j)
				{
					System.out.print(k%10);
					k++;
				}
			}
			System.out.println();
		}	
	}
}
