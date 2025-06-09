package StringPrograms;

public class ReverseTheEntireString {
	public static void main(String args[])
	{
	
	String originalStr = "i love programming And Designing ";
	String reversedStr = "";

	for (int i = 0; i < originalStr.length(); i++) {
	  reversedStr = originalStr.charAt(i) + reversedStr;
	}

	System.out.println("Reversed string: "+ reversedStr);
	}
}
