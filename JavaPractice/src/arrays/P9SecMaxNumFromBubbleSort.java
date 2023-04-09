package arrays;

import java.util.Arrays;

public class P9SecMaxNumFromBubbleSort {

	public static void main(String[] args) 

	{
		int []a= {10,50,30,20};
		System.out.println("before sort");
		System.out.println(Arrays.toString(a));
     
        for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        System.out.println("after sort");
		System.out.println(Arrays.toString(a));
		System.out.println("sec max num is"+a[a.length-2]);
	}
}
