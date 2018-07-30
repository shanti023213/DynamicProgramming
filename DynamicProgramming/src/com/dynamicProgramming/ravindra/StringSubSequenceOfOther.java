package com.dynamicProgramming.ravindra;

public class StringSubSequenceOfOther {

	public static void main(String[] args) {
		String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        System.out.println("Is SubString Of other:"+ isSubStringOfOther(str1,str2));

	}
	
	public static boolean isSubStringOfOther(String str1, String str2){
		
		int i=0; int j=0;
		while(i<str1.length() && j<str2.length()){
			if(str1.charAt(i) == str2.charAt(j)){
				i++;
			}
			j++;
		}
		
		if(i==str1.length()){
			return true;
		}
		
		return false;
	}

}
