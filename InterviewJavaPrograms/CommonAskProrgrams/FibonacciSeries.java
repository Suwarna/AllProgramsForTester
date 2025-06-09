package CommonAskProrgrams;


// https://www.programiz.com/java-programming/examples best site to all java program :
public class FibonacciSeries {

	public static void main(String[] args) {

	    int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; i++) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
}
