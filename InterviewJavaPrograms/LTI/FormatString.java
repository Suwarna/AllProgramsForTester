package LTI;

public class FormatString {

	
	   public static void main(String[] args) {
	        // Input string
	        String inputString = "My name is so and so";
			
			 String replacedString = inputString.replace(" ", "-");
			 
			 System.out.println(replacedString);
			 
			 //or

//	    public static void main(String[] args) {
//	        // Input string
//	        String inputString = "My name is so and so";
//
//	        // Call the method to format the string
//	        String formattedString = formatString(inputString);
//
//	        // Print the result
//	        System.out.println(formattedString);
//	    }
//
//	    public static String formatString(String str) {
//	        // Replace spaces with hyphens
//	        String replacedString = str.replace(" ", "-");
//
//	        // Enclose the modified string in curly braces
//	        return "{" + replacedString + "}";
//	    }
	}
}