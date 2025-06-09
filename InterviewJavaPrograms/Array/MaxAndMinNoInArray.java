package Array;

import java.util.Arrays;

public class MaxAndMinNoInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2, -4, 7};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    public static int findMax(int[] array) {
        int max = array[0]; // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0]; // Assume the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }
        return min;
    }
}

//public class MaxAndMinNoInArray {
//
//	 public static void main(String[] args) {
//	        int a[]={1,423,6,46,34,23,13,53,4}; 
//	          
//	          //Implemented inbuilt function to sort array
//	        Arrays.sort(a);
//	      
//	          // after sorting the value at 0th position will minimum and 
//	        //nth position will be maximum
//	        System.out.println("Minimum number is"+a[0]+"Maximum number is"+a[a.length-1]);
//	    }
//}
