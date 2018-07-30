package com.dynamicProgramming.ravindra;

public class LongestDecreasingSubSequence {

	public static void main(String[] args) {

		int[] arr = {2,10,11,5,3,4,12,1};
		int longestDecSubSequence = longestDecreasingSubSequence(arr);
		System.out.println("longestDecSubSequence:"+longestDecSubSequence);
	}
	
	public static int longestDecreasingSubSequence(int[] arr){
		
		int[] lds = new int[arr.length];
		lds[arr.length-1]=1; int maxCount =1;
		for(int i=arr.length-2 ;i >=0;i--){
			int count =1;
			int j= i+1;
			while(j<arr.length){
				if(arr[i]>arr[j]){
					count = 1+lds[j];
				}
				if(maxCount<count){
					maxCount =count;
				}
				j++;
			}
			lds[i] = maxCount;
		}
		
		return lds[0] ;
	}

}
