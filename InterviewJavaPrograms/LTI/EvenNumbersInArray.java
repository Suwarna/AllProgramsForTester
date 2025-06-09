package LTI;
import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        // Sample input array
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		 ArrayList<Integer> evenList = new ArrayList<>();

        // Loop through the input array and check for even numbers
        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        // Convert the ArrayList back to an array
        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }

         int[] evenNumbers = evenArray;

        // Print the result
        System.out.println("Even numbers in the array: " + Arrays.toString(evenNumbers));
    }
//        // Sample input array
//        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        // Call the method to get even numbers
//        int[] evenNumbers = getEvenNumbers(inputArray);
//
//        // Print the result
//        System.out.println("Even numbers in the array: " + Arrays.toString(evenNumbers));
//    }
//
//    public static int[] getEvenNumbers(int[] array) {
//        // Use an ArrayList to store even numbers dynamically
//        ArrayList<Integer> evenList = new ArrayList<>();
//
//        // Loop through the input array and check for even numbers
//        for (int num : array) {
//            if (num % 2 == 0) {
//                evenList.add(num);
//            }
//        }
//
//        // Convert the ArrayList back to an array
//        int[] evenArray = new int[evenList.size()];
//        for (int i = 0; i < evenList.size(); i++) {
//            evenArray[i] = evenList.get(i);
//        }
//
//        return evenArray;
//    }
}