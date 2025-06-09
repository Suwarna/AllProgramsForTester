package Array;

public class MovingZeroToEndFromArray {


	    public static void main(String[] args) {
	        // Sample array
	        int[] array = {0, 0, 0, 1, 12, 10};
	        //{0, 0, 0, 12, 5, 2}

	        // Call the method to shift zeros to the end
	        shiftZerosToEnd(array);

	        // Print the modified array
	        System.out.print("Array after shifting zeros to the end: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void shiftZerosToEnd(int[] array) {
	    	  for (int i = 0; i < array.length;i++) {
	              if (array[i]==0) {
	                  for(int j = i+1; j < array.length;j++) {
	                      if(array[j]!=0) {
	                          int temp = array[i];
	                          array[i]=array[j];
	                          array[j]=temp;
	                          break;
	                      }
	                  }
	              }
	          } 
	    }
	}


