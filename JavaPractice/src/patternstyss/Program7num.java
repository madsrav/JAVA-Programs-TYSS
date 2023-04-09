package patternstyss;

public class Program7num {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if(i>=j)
				{
					System.out.print(i%2);
				}
			}
			System.out.println();
		}

	}

}
