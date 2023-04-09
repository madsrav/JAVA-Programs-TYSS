package stringPrograms;

public class P10aSumOfNumInString {

	public static void main(String[] args) {
		String s="a11b22c33";
		int sum=0;
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);	
			if(ch>='0' && ch<='9')
			{
				int n=ch-48;//ASCII value of zero is 48
				num=num*10+n;
			}	
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println(sum);
	}
}
