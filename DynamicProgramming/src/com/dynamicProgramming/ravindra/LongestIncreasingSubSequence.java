package com.dynamicProgramming.ravindra;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		int[] arr = {50, 3, 10, 7, 40, 80};
		int n = longestIncreasingSubSequence(arr);
		System.out.print("LongestIncreasingSubSequence:"+n );
	}
	
	public static int longestIncreasingSubSequence(int[] arr){
		
		if(arr == null || arr.length==0){
			return 0;
		}
		int[] increasingSequence = new int[arr.length];
		increasingSequence[0]=1;
		
		int maxCount = 1;
		for(int i=1;i<arr.length;i++){
			int j=i-1; int count = 1;
			while(j>=0){
				
				if(arr[i]>arr[j]){
					if(count<=increasingSequence[j])
					count = increasingSequence[j]+1;
				}
				j--;
			}
			increasingSequence[i]=count;
			if(maxCount<count){
				maxCount =count;
			}
		}
		return maxCount;
	}

}
