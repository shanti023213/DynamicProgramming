package com.dynamicProgramming.ravindra;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSubSequence {

	public static void main(String[] args) {
		
		int[] arr = {1, 9, 3, 10, 4, 20, 2};
		int lengthOfSubsequence = longestSubsequence(arr);
		System.out.println("******:"+lengthOfSubsequence);

	}
	
	public static int longestSubsequence(int[] arr){
		
		Set<Integer> set = new HashSet<Integer>(); 
		
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		
		int maxCount=0;
		
		for(int i =0;i<arr.length;i++){
			
			int j=arr[i]; int count =0;
			if(!set.contains(j-1)){
				
				while(set.contains(j)){
					j++;
				}
			}
			if(maxCount<(j-arr[i])){
				maxCount = j-arr[i];
			}
			
		}
		
		return maxCount;
	}

}
