package arrays;

public class P16RotateArraywithKey {

	public static void main(String[] args) {
		int key=2;
		int a[]= {10,15,19,28};
		
		for(int i=0;i<key;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
