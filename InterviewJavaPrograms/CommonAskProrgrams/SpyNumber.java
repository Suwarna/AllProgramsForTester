package CommonAskProrgrams;

public class SpyNumber {

	//A number is said to be a Spy number if the sum of all the digits is equal to the multiplication of all digits.
	//Ex 22 is  2x2 = 4 and 2+2=4
	
	  public static void main(String[] args) 
	    { 
	        int product = 1, sum = 0, ld; 
	        int n = 22; 
	  
	        // calculate sum and product of the number here. 
	        while (n > 0) { 
	            ld = n % 10; 
	            sum = sum + ld; 
	            product = product * ld; 
	            n = n / 10; 
	        } 
	  
	        // compare the sum and product. 
	        if (sum == product) 
	            System.out.println( 
	                "Given number is spy number"); 
	        else
	            System.out.println( 
	                "Given number is not spy number"); 
	    } 
}
