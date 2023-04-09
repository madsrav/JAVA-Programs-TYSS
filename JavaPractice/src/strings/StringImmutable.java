package strings;

public class StringImmutable {

	public static void main(String[] args) 
	{
		String s=new String("testyantra");
		String s1=new String("testyantra");
		System.out.println(s+s1);//temporary change
		System.out.println(s);
		System.out.println(s1);
		String s2=s+s1;
		System.out.println(s2);//permanent change
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s2);
	}

}
