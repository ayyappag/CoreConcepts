package com.core.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "welcome to India";
		char[] ch = str.toCharArray();

	//	str = str.replaceAll("\\s", ""); - direct approach
		System.out.println(str);
		System.out.println("2nd approach");
		int count = removeSpaces(ch);
		System.out.println(String.valueOf(ch).subSequence(0, count));

	}

	static int removeSpaces(char[] str) {
		// To keep track of non-space character count
		int i,count = 0;

		// Traverse the given string.
		// If current character
		// is not space, then place
		// it at index 'count++'
		for ( i = 0; i < str.length; i++)
			if (str[i] != ' ')
				str[count++] = str[i]; // here count is
										// incremented
		System.out.println("i value = " +i);
		return count;
	}

}
