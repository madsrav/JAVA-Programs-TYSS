package stringPrograms;

public class P5PrintWordsContainsO {

	public static void main(String[] args) {
		
		String s="HELLO WHO ARE YOU";
		String []s1 =s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String sp=s1[i];
			if(sp.contains("O"))
			{
				System.out.println(sp);
			}
		}
		

	}

}
