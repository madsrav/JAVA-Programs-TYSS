package arrays;
public class P12AddingTwoDiffIndexArrays {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 ,7};
		int b[] = { 5, 4, 3, 2};

//		int length = a.length;
//		if (a.length < b.length) {
//			length = b.length;
//		}
//		for (int i = 0; i<length; i++) {
//			try {
//				System.out.println(a[i] + b[i]+" ");
//			}
//			catch (Exception e) {
//				if (a.length > b.length) {
//					System.out.println(a[i]);
//				}
//
//				else {
//					System.out.println(b[i]);
//				}
//			}
//		}
		
		
		int max=a.length, min=b.length;
		if(a.length<b.length)
		{
			 max=b.length;
			 min=a.length;
		}
		
		for(int i=0;i<min;i++)
		{
			System.out.print(a[i]+b[i]+" ");
		}
		
		for(int i=min;i<max;i++)
		{
			if(a.length>b.length)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
