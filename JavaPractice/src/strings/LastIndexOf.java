package strings;

public class LastIndexOf {

	public static void main(String[] args) {
		 String s="Testengineer";
		 System.out.println(s.lastIndexOf('e'));
         System.out.println(s.lastIndexOf("ee"));
         System.out.println(s.lastIndexOf('g', 12));
         System.out.println(s.lastIndexOf("gi", 11));
         System.out.println(s.lastIndexOf('e',3));
	}

}
