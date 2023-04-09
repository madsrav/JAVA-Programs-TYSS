package collctions.LinkedListAndVector;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack v=new Stack();//1.0 version
		v.push("push");
		v.addElement(112);
		v.add(2, "sra");
		v.add("pop");
		v.add(3, "van");
		v.addElement(42);

		System.out.println(v.peek());
		v.pop();
		System.out.println(v);
		//for delete all the elements in colletion
		while(!v.isEmpty())
		{
			System.out.println(v.pop());
		}
		System.out.println(v);
	} 

}
