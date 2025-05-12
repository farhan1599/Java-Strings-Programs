package com.practice.strings;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "programming";

		removeAllDuplicatesChars(str);

	}

	private static void removeAllDuplicatesChars(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (result.indexOf(ch) == -1) {
				result = result + ch; // Only add if not already in result
			}
		}
		System.out.println("Original string: " + str);
		System.out.println("After removing duplicate chars: " + result);

	}

}
