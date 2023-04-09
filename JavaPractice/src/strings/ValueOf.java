package strings;

public class ValueOf {

	public static void main(String[] args) {
		int i=10;
		System.out.println(i+10);
		String str = String.valueOf(i);//here valueof() is converting primitive to non primitive(wrapper class)
		System.out.println(str+10);

	}

}
