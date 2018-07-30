package com.dynamicProgramming.ravindra;

public class LongestNonOverlappingRepeatingSubString {

	public static void main(String[] args) {
		
		String str = "aabaabaaba";
		String longestString = logestNonRepeatingSubstring(str);
		System.out.println("*****:"+longestString);
	}
	
	public static String logestNonRepeatingSubstring(String str){
		
		int[][] arr = new int[str.length()][str.length()]; int maxCount=0; int endIndex =0;
		
		for(int i=0;i<str.length();i++){
			arr[i][i] =0;
		}
		
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				
				if(str.charAt(i) == str.charAt(j)){
					
					if(i>=1 && (j-i)>arr[i-1][j-1]){
					arr[i][j] = 1+arr[i-1][j-1];
					}else{
						arr[i][j] = 1;
					}
					
				}else{
					arr[i][j] =0;
				}
				if(maxCount<arr[i][j]){
					maxCount = arr[i][j];
					endIndex =i;
					
				}
			}
		}
		return printResult(str,maxCount,endIndex);
	}
	
	public static String printResult(String str , int maxCount , int endIndex){
		
			
		
		return str.substring(endIndex-maxCount+1, endIndex+1);
	}

}
