package stringPrograms;

public class P11PrintFrequenceyOfNum {

	public static void main(String[] args) {

		String s = "aaaaabccda";

	//	for (int i = 0; i < s.length(); i++) 
		int i=0;
		while(i<s.length()){
			int count = 1;
			for (int j = i; j < s.length()-1; j++) {
				if (s.charAt(i) == s.charAt(j+1)) {
					count++;
					i++;
				} 
				else 
				{
					break;
				}
			}
			System.out.println(s.charAt(i)+" "+count);
			i++;
		}
	}
}
