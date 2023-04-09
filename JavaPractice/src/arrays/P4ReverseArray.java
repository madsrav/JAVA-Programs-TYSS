package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P4ReverseArray {

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of array");
//        int size = sc.nextInt();
//        int a[]= new int[size];
//        System.out.println("enter the values");
//        
		int a[]= {1,2,3,4,5};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
//        for(int i=0;i<a.length;i++)
//        {
//        	a[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(a));    
//              
//        int start=0;
//        int end=a.length-1;
//		for(int i=0;i<=a.length;i++)
//		{
//			if(start<end)
//			{
//				int temp=a[start];
//				a[start]=a[end];
//				a[end]=temp;
//				start++;
//				end--;
//			}
//		}
//		System.out.println("after reverse");
//		System.out.println(Arrays.toString(a)); 
//		for(int i=0;i<a.length;i++)
//		{
//	System.out.println(a[i]);
//		}
        
  //another method to write reverse of array
        
//        for(int j=0;j<a.length/2;j++)
//        {
//        	System.out.println(a[j]);
//        	int temp=a[j];
//			a[j]=a[a.length-1];
//			a[a.length-1-j]=temp;
//        }
//	
	}

}
