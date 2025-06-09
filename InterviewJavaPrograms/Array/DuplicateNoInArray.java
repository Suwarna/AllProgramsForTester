package Array;

import java.util.HashSet;

public class DuplicateNoInArray {
	
  public static void main(String args[])
  {
	 int[] numbers = {1, 2, 3, 4, 5, 3, 6, 7, 8, 1}; // Example array
     findDuplicates(numbers);
}

public static void findDuplicates(int[] array) {
    HashSet<Integer> seen = new HashSet<>();
    boolean hasDuplicates = false;

    System.out.println("Duplicate numbers in the array:");
    for (int number : array) {
        if (seen.contains(number)) {
            System.out.println(number);
            hasDuplicates = true;
        } else {
            seen.add(number);
        }
    }

    if (!hasDuplicates) {
        System.out.println("No duplicates found.");
    }
}

}