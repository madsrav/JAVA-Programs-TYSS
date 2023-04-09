package arrays;

import java.util.Arrays;
public class P13AddingArraysUsingExtraArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 5, 4, 3, 2 };

		int length = a.length;
		if (a.length < b.length) {
			length = b.length;
		}

		int c[] = new int[length];
		for (int i = 0; i < a.length; i++) {
			try {
				c[i] = a[i] + b[i];
			} catch (Exception e) {
				if (a.length > b.length) {
					c[i] = a[i];
				} else {
					c[i] = b[i];
				}

			}
		}
	System.out.println(Arrays.toString(c));
	
	}
}
