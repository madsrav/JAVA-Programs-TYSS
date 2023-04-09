package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P5PassingValuesFromOneArrayToAnotherArray {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++)
		{
		  a[i]=sc.nextInt();	
		}
		System.out.println("array of a "+Arrays.toString(a));
	//	int b[]=a;
		int b[]=new int [a.length];
		for(int j=0;j<a.length;j++)
		{
			 b[j]=a[j];
		}
		System.out.println("array of b"+Arrays.toString(b));
		
		
	}
}
 