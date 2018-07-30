package com.dynamicProgramming.ravindra;

public class LongestPalindromicSubSequence {

	public static void main(String[] args) {
	
			String str = "raudra";
			System.out.println(lps(str));

	}
	
	
	public static int lps(String str){
		
		int[][] a = new int[str.length()][str.length()];
		
		for(int i=0;i<str.length();i++){
			a[i][i]=1;
		}
		
		for(int l=2;l<=str.length();l++){
			for(int i=0;i<str.length()-l+1;i++){
				int j= i+l-1;
				
				if(str.charAt(i) ==str.charAt(j)){
					a[i][j] = 2 + (l==2?0:a[i+1][j-1]);
				}else{
					a[i][j] = Math.max(a[i][j-1], a[i+1][j]);
				}
			}
		}
		
		return a[0][str.length()-1];
	}

}
