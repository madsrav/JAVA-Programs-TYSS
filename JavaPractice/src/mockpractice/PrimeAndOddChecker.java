package mockpractice;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAndOddChecker {
    public static void main(String[] args) {
        int num1 = 17;
        
        // Check if num1 is prime and odd
        if (num1 == 2) {
            System.out.println(num1 + " is a prime number and an even number.");
        }
        else if (num1 == 3 || num1 == 5 || num1 == 7) {
            System.out.println(num1 + " is a prime number and an odd number.");
        } else if (num1 % 2 != 0 && num1 % 3 != 0 && num1 % 5 != 0 && num1 % 7 != 0) {
            System.out.println(num1 + " is a prime number and an odd number.");
        } else {
            System.out.println(num1 + " is not a prime number and/or not an odd number.");
        }
    }
}
