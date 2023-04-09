package wrapperclasses;

public class AutoUnboxing {

	public static void main(String[] args) {
		
		double d = 58.0;// non primitive
		double i = d;// auto unboxing
		System.out.println(i);//primitive
		
		int e = new Integer(100);//auto unboxing
		System.out.println(e);//primitive

	}

}
