package CommonAskProrgrams;

import java.util.Scanner;

public class ArmstrongNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int numberOfDigits = String.valueOf(number).length();

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            number /= 10;
	        }

	        return sum == originalNumber;
	    }
	}

  
