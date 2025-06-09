package CollectionPrograms;

import java.util.HashMap;

public class OcuuranceOfElementUsingHashMap {

	public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 1, 2};

        // Create a HashMap to store the occurrences
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        // Iterate through the array
        for (int num : array) {
            // If the number is already in the map, increment its count
            if (occurrences.containsKey(num)) {
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                // If not, add it to the map with a count of 1
                occurrences.put(num, 1);
            }
        }

        // Print the occurrences
        System.out.println("Occurrences of elements in the array:");
        for (HashMap.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

}
