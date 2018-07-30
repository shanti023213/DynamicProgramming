package com.dynamicProgramming.ravindra;

public class NoOfOccuranceOfStringAsSubsequenceOfOther {

	public static void main(String[] args) {
		String str1= "abade";
		String str2 = "ae";
		System.out.println("The number of times string occurs is: " +countString(str1, str2));
	

	}
	
	public static int countString(String str1, String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] temp = new int[len1+1][len2+1];
		int i, j;

		for(i = 0; i <= len1; i++)
			for(j = 0; j <= len2; j++)
				temp[i][j] = 0;

		for(i = 0; i <= len2; i++)
			temp[0][i] = 0;

		for(i = 0; i <= len1; i++)
	        temp[i][0] = 1;

	    for(i = 1; i <= len1; i++)
	        for(j = 1; j <= len2; j++)
	        	temp[i][j] = (str1.charAt(i - 1) == str2.charAt(j - 1))? (temp[i - 1][j - 1] + temp[i - 1][j]):temp[i-1][j];
	 
	    return temp[len1][len2];
	}

	
	

}
