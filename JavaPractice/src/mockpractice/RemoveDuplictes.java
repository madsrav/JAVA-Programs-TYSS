package mockpractice;

public class RemoveDuplictes {

	public static void main(String[] args) {
		
		String s="s%r$a#v!a*n";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		
			if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.print(ch[i]);
			}
			
		}

		System.out.println();
		String s1 = s.replaceAll("[^a-zA-Z]","");
		System.out.print(s1);
		
	}

}
