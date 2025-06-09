
public class NumberOccuranceInArray {
	
	public static int countOccurrences(int arr[], int n, int num)
	{
	    int res = 0;
	    for (int i = 0; i < n; i++)
	        if (num == arr[i])
	            res++;
	    return res;
	}
	public static void main(String arg[])
	{  
	  int arr[] = {7, 2, 7, 2, 7, 3, 4, 7, 8, 7};
	    int sz = arr.length;
	    int no = 7;
		System.out.println(countOccurrences(arr,sz,no));
	}
	

}
