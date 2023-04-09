package collctions.LinkedListAndVector;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector v=new Vector();//1.0 version
		v.add('s');
		v.addElement(112);
		v.add(2, "sra");
		v.add(3, "van");
		v.addElement(42);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.remove(1);
		System.out.println(v);
		v.remove('s');
		System.out.println(v);
	    v.removeAllElements();
	    System.out.println(v);
	}

}
