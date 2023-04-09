package stringPrograms;

public class P6PrintStringAndReverseOfString {

	public static void main(String[] args) {
		String s="hyderabad";

		//print string in same order
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}

		//print string in reverse order
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print("  "+s.charAt(i));
		}

		//print string in reverse order by using another third variable(temp var)
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(" "+s1);

		//reverse of string without using length method
		int count=0;
		char[] ch = s.toCharArray();
		for(char c:ch) // Enhanced for loop (for each loop)
		{
			count++;
		}
		System.out.println(count);

		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		
		//reverse of string without using length method using third variable
				int count1=0;
				char[] ch1 = s.toCharArray();
				String rev="";
				for(char c:ch1) // Enhanced for loop (for each loop)
				{
					count1++;
				}
				System.out.println(count1);

				for(int i=count-1;i>=0;i--)
				{
					rev=rev+ch1[i];
				}
		
				System.out.println(rev+" ");	
	}
}
