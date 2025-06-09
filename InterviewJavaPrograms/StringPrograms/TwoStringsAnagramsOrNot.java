package StringPrograms;

import java.util.Arrays;

//two strings are considered anagrams if they have the same characters with the same frequency,but the order of the characters is different. 
//For example, “listen” and “silent” are anagrams because you can rearrange the letters in one to form the other.
//And frequency of letter in both the string are also same.

public class TwoStringsAnagramsOrNot {
	
	static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same, then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings in ascending order
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        char str1[] = { 'n', 'i', 't', 'a' };
        char str2[] = { 'a', 'n', 't', 't' };
 
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }

}
