package StringPrograms;

public class CharOccuranceInString {

	//This program is to count the occurrences of character(specific) from given string.
	public static int countOccurance(String str,char cs)
	{
		int res=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==cs)
				res++;
		}
		return res;
		
	}
	public static void main(String args[])
	{
		String s="greekforgeeks";
		char c='e';
		System.out.println(countOccurance(s,c));
		
	}
}
