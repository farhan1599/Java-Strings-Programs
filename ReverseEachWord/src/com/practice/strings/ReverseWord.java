package com.practice.strings;

public class ReverseWord {

	public static void main(String[] args) {
	 
		String str ="hello world";
		
		reverseEachWord(str);

	}

	private static void reverseEachWord(String str) {
		
		String[] strArr = str.split(" ");
		
		String newStr="";
		
		for(int i=0;i<strArr.length;i++) {
		
			for(int j=strArr[i].length()-1;j>=0;j--) {
				
				newStr=newStr+strArr[i].charAt(j);
			}
			
			newStr = newStr+" ";
		}
		
		System.out.println(newStr);
		
	}

}
