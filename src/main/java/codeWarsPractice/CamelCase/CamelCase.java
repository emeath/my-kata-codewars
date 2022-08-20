package codeWarsPractice.CamelCase;

// https://www.codewars.com/kata/517abf86da9663f1d2000003/java

/*
DESCRIPTION:
Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

public class CamelCase {

	public static String toCamelCase(String s){
	    
	    if(s.isEmpty())
	      return "";

			String[] splitedArrayString;
			splitedArrayString = s.split("-");
			if(splitedArrayString.length == 1) {
				splitedArrayString = s.split("_");
			}
			
			char first = splitedArrayString[0].charAt(0);
			
			boolean isFirstCharUpper = isCharUppercase(asciiNumberRepresentation(first));
			if(isFirstCharUpper) {
				splitedArrayString[0] = first + splitedArrayString[0].toLowerCase().substring(1, splitedArrayString[0].length());
			} else {
				splitedArrayString[0] = splitedArrayString[0].toLowerCase();
			}
			
			String output = splitedArrayString[0];
			
			for(int i = 1; i < splitedArrayString.length; i++) {
				String string = splitedArrayString[i];
				output += Character.toUpperCase(string.charAt(0)) + string.toLowerCase().substring(1, string.length());
			} 
	    
	    return output;
	  }
	
	public static void main(String[] args) {
		
		String input = "the-stealth-warrior";
		System.out.println(toCamelCase(input));
	}
	
	private static int asciiNumberRepresentation(char c) {
		return (int) c;
	}
	
	private static boolean isCharUppercase(int numberAsciiChar) {
		if (numberAsciiChar >= 65 && numberAsciiChar <= 90)
			return true;
		else
			return false;
	}

} 
