
public class NumberOccurenceArray {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 2, 3, 4, 5, 6};
	        int target = 3;
	        int count = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                count++;
	            }
	        }

	        System.out.println("The number " + target + " occurs " + count + " times in the array.");
	    }
	
}
