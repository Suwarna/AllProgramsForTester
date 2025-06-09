
public class SwapNumbers {
	

    public static void main(String a[])
    {
        int x = 5;
        int y = 6;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }

}
