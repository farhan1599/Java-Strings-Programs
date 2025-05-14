package com.practice.strings;

public class MostRepeatedChar {

	public static void main(String[] args) {

		String str = "success";

		findMostRepeatedChar(str);

	}

	private static void findMostRepeatedChar(String str) {

		char[] ch = str.toCharArray();
		int maxCount = 0;
		char mostRepeated = ch[0];

		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (visited[i]) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					visited[j] = true;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				mostRepeated = ch[i];
			}

		}
		System.out.println("Most repeated char is " + mostRepeated + ": ( occured " + maxCount + " times )");

	}

}
