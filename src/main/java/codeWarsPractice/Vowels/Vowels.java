package codeWarsPractice.Vowels;

public class Vowels {
	
	public static int vowelCounter(String string) {
			int vowelCounter = 0;
			char[] characters = string.toCharArray();
			for (char c : characters) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCounter++;
				}
			}
			return vowelCounter;
		}
	}