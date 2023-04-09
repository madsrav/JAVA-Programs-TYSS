package stringPrograms;

public class P18aPrintMinWord {

	public static void main(String[] args) {
		String s="we are all humans";
		String[] split = s.split(" ");
		int min=split[0].length();
		String minWord="";

		for(int i=0;i<split.length;i++)
		{
			if(split[i].length()<=min)
			{
				min=split[i].length();
				minWord=split[i];
			}

		}
		
		System.out.println(minWord+"-->"+min);		

	}

}
