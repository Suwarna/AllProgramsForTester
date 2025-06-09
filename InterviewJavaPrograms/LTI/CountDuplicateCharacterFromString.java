package LTI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateCharacterFromString {

	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Call the method to count duplicate characters
	        countDuplicateCharacters(input);
	        
	        // Close the scanner
	        scanner.close();
	    }

	    private static void countDuplicateCharacters(String str) {
	        // Create a HashMap to store character counts
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to a character array
	        char[] characters = str.toCharArray();

	        // Count each character's frequency
	        for (char c : characters) {
	            // Ignore spaces
	            if (c != ' ') {
	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	            }
	        }

	        // Display duplicate characters
	        System.out.println("Duplicate characters in the given string:");
	        boolean hasDuplicates = false;
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	                hasDuplicates = true;
	            }
	        }

	        if (!hasDuplicates) {
	            System.out.println("No duplicate characters found.");
	        }
	    }

}
