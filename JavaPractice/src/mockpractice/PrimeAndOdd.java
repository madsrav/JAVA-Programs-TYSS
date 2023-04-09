package mockpractice;

public class PrimeAndOdd {
	
	public static void main(String[] args)
	{
		int num1=29,num2=7;
		boolean isprime  = true;
		for (int i = 2; i < num1; i++) {
		
		if(num1%i==0)
		{
			isprime = false;
			break;
		}	
		}
		
		if (isprime) {
			System.out.println(num1 + " is prime");
		} else {
			System.out.println(num1 + " is not a prime"); 
		}
		
		if (num2%2 == 0) {
			System.out.println(num2+ " is even" );
		}else {
			System.out.println(num2+ " is odd" );
		}
	}

}
