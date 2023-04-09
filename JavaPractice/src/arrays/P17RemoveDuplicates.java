package arrays;

public class P17RemoveDuplicates {

	public static void main(String[] args) {
		int a[] = {1, 1, 2, 2, 3, 3, 4, 4, 7, 8, 8 };
		int k = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i + 1]) {
				a[k] = a[i];
				k++;
			}
		}
		a[k] = a[a.length - 1];
		for (int i=0;i<k+1; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
