package patternstyss;

public class Program4 {
	
	public static void main(String[] args) {
	//	char k='a';
//		for(int i=0;i<7;i++)
//		{
//			k=(char)('a'+i);
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(k);
//				k++;
//			}
//			System.out.println();
//		}
		int num=5;
		
		for(int i=0;i<num;i++)
		{
			for(int  j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+i+j));
				}
				
			}
		System.out.println();
		}
		
	}
	}

