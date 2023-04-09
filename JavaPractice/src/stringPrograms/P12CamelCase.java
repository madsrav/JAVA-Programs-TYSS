package stringPrograms;

public class P12CamelCase {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] split=s.split(" ");
		String CapWord="";

		for(String spl:split)
		{
			String newword = spl.substring(0,1).toUpperCase()+spl.substring(1);
			CapWord=CapWord+" "+newword;
		}
		System.out.println(CapWord.trim());
	}
}
