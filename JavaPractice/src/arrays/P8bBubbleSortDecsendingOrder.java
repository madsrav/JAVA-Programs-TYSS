package arrays;

import java.util.Arrays;

public class P8bBubbleSortDecsendingOrder {
	
public static void main(String[] args) {
		
		int []a= {1,5,3,4};
		System.out.println("before sort");
		System.out.println(Arrays.toString(a));
     
        for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{	
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        System.out.println("after sort"); 
		System.out.println(Arrays.toString(a));
}
}
