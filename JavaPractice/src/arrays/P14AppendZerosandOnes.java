package arrays;

import java.util.Arrays;

public class P14AppendZerosandOnes {

	public static void main(String[] args) {
		int a[]= {4,1,0,1,1,5,6,7,0,4,0,2,0,9,5,4,0,1};
		int b[]=new int[a.length];
		int start=0, end=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
//			if(a[i]!=0)
//			{
//				b[end]=a[i];
//				end--;
//			}
//			else
//			{
//				b[start]=a[i];
//				start++;
//			}		
			
			if(a[i]==0)
			{
				b[start]=a[i];
				start++;
			}
			else if(a[i]==1)
			{
				b[end]=a[i];
				end--;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0 && a[i]!=1)
			{
				b[start]=a[i];
				start++;
			}
		}	
		System.out.println(Arrays.toString(b));	
	}
}
