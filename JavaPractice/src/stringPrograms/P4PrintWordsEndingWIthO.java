package stringPrograms;

public class P4PrintWordsEndingWIthO {


	public static void main(String[] args) {
		
		String s="HELLO WHO ARE YOU";
		String []s1 =s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String sp=s1[i];
			if(sp.endsWith("O"))
			{
				System.out.println(sp);
			}
		}
		
//		for(int i=0;i<s1.length;i++)
//		{
//			String sp=s1[i];
//			if(sp.charAt(sp.length()-1)=='O')
//			{
//				System.out.println(sp);
//			}
//		}
		
		
	}

}
