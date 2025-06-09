package Array;

public class OccuranceOfGivenNumInArray {
	
	  static int countOccurrences(int arr[], int n, int x)
	    {
	        int res = 0;
	        for (int i=0; i<n; i++)
	            if (x == arr[i])
	              res++;
	        return res;
	    }
	    
	    public static void main(String args[])
	    {
	        int arr[] = {2, 9, 6, 5, 2, 3, 2, 7 ,8 ,2 ,4 ,2 };
	        int n = arr.length;
	        int x = 2;
	        System.out.println("The occurances of the number is "+countOccurrences(arr, n, x));
	    }

}
