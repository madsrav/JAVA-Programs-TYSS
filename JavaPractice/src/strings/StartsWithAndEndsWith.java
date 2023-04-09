package strings;

public class StartsWithAndEndsWith {

	public static void main(String[] args) {
		String s="TestEngineer";
		System.out.println(s.startsWith("T"));
		System.out.println(s.startsWith("r"));
		System.out.println(s.endsWith("r"));
		System.out.println(s.endsWith("T"));
		
		System.out.println(s.startsWith("e",9));
	}

}
