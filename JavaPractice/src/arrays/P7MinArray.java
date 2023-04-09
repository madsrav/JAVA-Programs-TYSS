package arrays;

import java.util.Scanner;

public class P7MinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int []a = new int [size];
    // 	int a[]= {1,2,3,4};
		System.out.println("enter the values");
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	
      System.out.println(min);	
	}

}
