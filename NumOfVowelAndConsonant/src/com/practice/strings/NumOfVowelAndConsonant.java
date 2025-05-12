package com.practice.strings;

public class NumOfVowelAndConsonant {

	public static void main(String[] args) {

		String str = "Ashok IT";

		countVowelAndConsonant(str);
	}

	private static void countVowelAndConsonant(String str) {

		// convert string to char array
		char[] ch = str.toCharArray();

		int vowelsCount = 0, consonantCount = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				vowelsCount++;
			} else if (!Character.isDigit(ch[i]) && ch[i] != ' ' && ch[i] != '@' && ch[i] != '&' && ch[i] != '$'
					&& ch[i] != '#' && ch[i] != '!') {

				consonantCount++;
			}
		}
		System.out.println("Vowles count : " + vowelsCount);
		System.out.println("Consonants count : " + consonantCount);

	}
}
