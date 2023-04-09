package stringPrograms;

import java.util.Arrays;

public class P16SwapAdjacentCharFromLeftAndRight {

	public static void main(String[] args) {

		String s = "a%#c%d#*f";
		char[] ch = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[left] >= 'a' && ch[left] <= 'z' || ch[left] >= 'A' && ch[left] <= 'Z') {
				if (ch[right] >= 'a' && ch[right] <= 'z' || ch[right] >= 'A' && ch[right] <= 'Z') {
					if (left < right) {
						char temp = ch[left];
						ch[left] = ch[right];
						ch[right] = temp;
						left++;
						right--;
					}
				}
				else {
					right--;
				}
			} 
			else {
				left++;
			}
		}
		System.out.println("after swap");
		 System.out.print(Arrays.toString(ch));
		
//		 for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}
//		
	}
}

