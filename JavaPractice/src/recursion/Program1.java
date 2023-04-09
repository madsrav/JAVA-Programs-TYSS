package recursion;

public class Program1 {

	public static void m1()
	{
		System.out.println("non parameterised method");
	}
	public static void m1(int a)
	{
		m1();
		System.out.println("int type parameterised method");
	}
	public static void m1(int a,int b)
	{
		m1(10);
		System.out.println("double int type parameterised method");
	}
	
	public static void main(String[] args) {
		m1(10,20);

	}

}
