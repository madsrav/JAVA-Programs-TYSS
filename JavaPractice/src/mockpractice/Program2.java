package mockpractice;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter size of array");
//	int size = sc.nextInt();
//	int a[]=new int[size];
//	System.out.println("enter the values");
//	 
//	for(int i=0;i<a.length;i++)
//	{
//		a[i]=sc.nextInt();
//	}
	int a[]= {1,2,3,4};
	int fmax=a[0];
	int max=a[0];
	int fmin=a[0];
	int min=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fmax)
		{
			max=fmax;
			fmax=a[i];
			
		}
		
		if(a[i]<fmin)
		{
			
			fmin=a[i];
			min=fmin;
			
		}
		else if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(fmax+" "+max);
	System.out.println(fmin+" "+min);

	}
}
