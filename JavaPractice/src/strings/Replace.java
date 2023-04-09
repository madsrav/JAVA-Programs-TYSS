package strings;

public class Replace {

	public static void main(String[] args) {
		
		String s="TestEngineer";
		String s1 = s.replace("Test", "testengineer");
		System.out.println(s1);
		
		/*
		 * main difference for replace and replaceAll is in replacAll we can use array to replace the string
		 * but in replace it cannot replace the array.
		 */
		
		String s2 = s.replace("Eng", "g");
		System.out.println(s2);
		
		String s3 = s.replaceAll("TestEngineer", "TESTENGINEER");
		System.out.println(s3);
		
		String s4 = s.replaceAll("Eng", "and");
		System.out.println(s4);
		
		String s5 = s.replaceAll("[aeiou]", "TEST");
		System.out.println(s5);
		
		String s6 = s.replaceFirst("e","G");
		System.out.println(s6);
	
	}

}
