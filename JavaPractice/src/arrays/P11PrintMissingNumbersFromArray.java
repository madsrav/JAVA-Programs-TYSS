package arrays;

public class P11PrintMissingNumbersFromArray {

	public static void main(String[] args) {
		
		int []a= {1,3,5,7,9};
		for(int i=1;i<=10;i++)
		{
			boolean status = true;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					status=false;
					break;
				}
			}
			if(status==true)
			{
				System.out.print(i+" ");
			}
		}
	}
}
