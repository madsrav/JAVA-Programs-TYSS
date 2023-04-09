package collectionsPrograms;
import java.util.LinkedHashSet;
public class P7WordsCount {
	public static void main(String[] args) {

		String s = "welcome to india welcome to tyss";
		String[] split = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		for (int i = 0; i < split.length; i++) {
			lh.add(split[i]);
		}
		System.out.println(lh);
		
		for(String ch:lh)
		{
			int count=0;
			
			for(int i=0;i<split.length;i++)
			{
				if(ch.equals(split[i]))
				{
					count++;
				}
			}
		System.out.println(ch+" "+count);
		}	
	}
}
