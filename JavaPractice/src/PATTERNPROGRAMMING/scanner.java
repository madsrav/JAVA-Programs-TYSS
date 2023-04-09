package PATTERNPROGRAMMING;
import java.util.Scanner;
public class scanner {
	public static void arm(int num){
		int cp=num,rem,arm=0;
		while(num>0)
		{
			rem=num%10;
			arm=arm+rem*rem*rem;
			num=num/10;
		}
		if(arm==cp)
			System.out.println(cp+"num is arm");
		else
		
			System.out.println(cp+"num is non arm");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
	     int num = sc.nextInt();
		 arm(num);
	}

}
