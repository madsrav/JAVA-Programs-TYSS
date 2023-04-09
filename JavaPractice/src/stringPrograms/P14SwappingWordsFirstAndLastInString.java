package stringPrograms;

public class P14SwappingWordsFirstAndLastInString {

	public static void main(String[] args) {
		
		String s="im in testyantra hyderabad";
		String[] split=s.split(" ");
		
		String temp=split[0];
		split[0]=split[split.length-1];
		split[split.length-1]=temp;
	    for(int i=0;i<split.length;i++)
	    {
	    	System.out.print(split[i]+" ");	
	    }
	}
}
