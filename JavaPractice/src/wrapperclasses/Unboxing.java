package wrapperclasses;

public class Unboxing {

	public static void main(String[] args) {

		int a=10;//primitive
		Integer i = a;//autoBoxing
		int s=i.intValue();//primitive
		System.out.println(s);


		Double e=10.0;//non primitive
	    double s1 = e.doubleValue();//unboxing
		System.out.println(s1);//primitive
		
		
		Integer i2=new Integer(100); //non primitive
		int a1 = i2.intValue();//unboxing
		System.out.println(a1);//non primtive
	}

}
