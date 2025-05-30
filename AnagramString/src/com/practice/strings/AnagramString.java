package com.practice.strings;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}

	}

	private static boolean isAnagram(String str1, String str2) {

		// Remove spaces and convert to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to char arrays and sort them
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
         sort(arr1);
         sort(arr2);
		//Arrays.sort(arr1);
		//Arrays.sort(arr2);
		
		
		
		

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		//return true;

		 return Arrays.equals(arr1, arr2);

	}
	
	
	private static void sort(char[] arr) {
		
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
