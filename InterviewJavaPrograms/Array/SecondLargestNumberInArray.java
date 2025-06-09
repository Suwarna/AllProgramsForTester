package Array;
import java.util.Arrays;

public class SecondLargestNumberInArray {
	    
	    // function to find the second largest element
	    static int getSecondLargest(int[] arr) {
	        int n = arr.length;
	        System.out.println("Array length:"+n);
	        
	        // Sort the array in non-decreasing /ascending order
	       Arrays.sort(arr);
	        
	        // start from second last element as last element is the largest
	        for (int i = n - 2; i >= 0; i--) {
	            
	            // return the first element which is not equal to the 
	            // largest element
	            if (arr[i] != arr[n - 1]) {
	                return arr[i];
	                
	            }
	            System.out.println(arr[i]);
	        }
	        
	        // If no second largest element was found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = { 12, 35, 1, 10, 34, 1 };
	        System.out.println(getSecondLargest(arr));
	    }
	}


