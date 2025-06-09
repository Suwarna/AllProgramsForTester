package StringPrograms;

public class PalindromeOrNot {
	
	public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        // Compare characters while i < j
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                return true;      
            }
            i++;
            j--;
        }
        return false;      
    }

    public static void main(String[] args) {
      
        // Input strings
        String s1 = "RACECar";
      
        // Convert strings to lowercase for  case-insensitive comparison
        s1 = s1.toLowerCase();

        if (isPalindrome(s1)) {
            System.out.println("\"" + s1 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s1 + "\" is not a palindrome.");
        }

    }

}
