package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TraverseHashMapUsingWhileAndForEachLoop {
	
	public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Iterating using a while loop
        System.out.println("Iterating using a while loop:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating using an enhanced for loop
        System.out.println("\nIterating using an enhanced for loop:");
        for (Map.Entry entry:map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
