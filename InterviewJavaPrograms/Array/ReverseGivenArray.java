package Array;

public class ReverseGivenArray {
	public static void reverseArray(int[] arr)
    {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - i - 1];
            }
        System.out.print("Reversed Array: ");
        for (int i : revArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArray(originalArr);
    }

}
