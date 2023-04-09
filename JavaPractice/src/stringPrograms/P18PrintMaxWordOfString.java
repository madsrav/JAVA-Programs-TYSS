package stringPrograms;

public class P18PrintMaxWordOfString {

	public static void main(String[] args) {
		String s="we are all humans";
		String[] split = s.split(" ");
		int max=0;
		String maxWord="";

		for(int i=0;i<split.length;i++)
		{
			if(split[i].length()>max)
			{
				max=split[i].length();
				maxWord=split[i];
			}

		}
		
		System.out.println(maxWord+" "+max);		

	}

}