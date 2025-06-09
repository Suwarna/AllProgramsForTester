package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountForEachCharacterFromString {

	
	public static void main(String[] args) {
        String str= "hello world"; // Example input string
       
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a character array
        char[] charArr = str.toCharArray();

        // Iterate through each character in the array
        for (char c : charArr) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        
        // It count for places also with blank value:
        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
