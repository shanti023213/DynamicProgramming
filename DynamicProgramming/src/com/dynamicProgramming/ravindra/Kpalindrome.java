package com.dynamicProgramming.ravindra;

public class Kpalindrome {

	public static void main(String[] args) {
		
		String str = "abcdecba";
		System.out.println("Is K-Palindrome:" +findKpalindrome(str,1));
	}
	
	public static boolean findKpalindrome(String str, int k){
		
		String str2 = reverse(str.toCharArray());
		int lcs = lcsubsequence(str,str2);
		
		if(str.length()-lcs<=k){
			return true;
		}
		return false;
	}
	
	public static String reverse(char[] str){
		
		int l =0; int r= str.length;
		char[] str2 = new char[str.length];
		int j=0;
		for(int i=str.length-1; i>=0;i--,j++){
			str2[j]= str[i];
		}
		return new String(str2);
	}
	
	public static int lcsubsequence(String str1, String str2){
		int[][] lcs = new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<lcs.length;i++){
			for(int j=0;j<lcs[0].length;j++){
				
				if(i==0 || j==0){
					lcs[i][j] =0;
					continue;
				}
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					lcs[i][j] = 1+ lcs[i-1][j-1];
				}else{
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		return lcs[lcs.length-1][lcs[0].length-1];
	}

}
