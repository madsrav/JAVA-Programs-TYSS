package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10PrintTwoMaxNumbersWOBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the values");
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int fmin=a[0];
		int smin=a[0];
		int fmax = a[0];
		int smax = a[0];
		
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] > fmax) {
				smax = fmax;
				fmax = a[i];
			}
			else if (a[i] > smax || smax==fmax ) {
				smax = a[i];
			}
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin)
			{
				
				smin=fmin;
				fmin=a[i];
				
			}
			else if(a[i]<smin||smin==fmin)
			{
				smin=a[i];
			}
		}
		
		System.out.println(fmin+" "+smin);
		System.out.println(fmax + " " + smax);
	}
}
