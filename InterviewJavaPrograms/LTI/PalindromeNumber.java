package LTI;

import java.util.Scanner;

public class PalindromeNumber {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
			
			 int originalNum = num; // Store the original number
	        int reversedNum = 0;   // Variable to store the reversed number

	        // Reverse the number
	        while (num > 0) {
	            int digit = num % 10; // Get the last digit
	            reversedNum = reversedNum * 10 + digit; // Build the reversed number
	            num = num/ 10; // Remove the last digit
	        }

	        // Check if the original number is equal to the reversed number
	        if(originalNum == reversedNum)
			{
			 System.out.print("Enter number is a palindrome number: "+reversedNum);
			}
			 else
			 {
				 System.out.print("Enter number is not a palindrome number");
			 }
				 
			}
	    }

