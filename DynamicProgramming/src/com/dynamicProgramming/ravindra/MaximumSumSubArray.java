package com.dynamicProgramming.ravindra;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-3,10,5,-20,4,11,-5,7};
		int maxSum = maximumSumSubArray(arr);
		System.out.println("Sum:"+maxSum);
	}
	
	public static int maximumSumSubArray(int[] arr){
		
		int sumSoFar =0; int maxSum=0; int index=-1;
		for(int i=0;i<arr.length;i++){
			sumSoFar =sumSoFar+arr[i];
			if(sumSoFar<0){
				sumSoFar =0;
			}
			
			if(maxSum<sumSoFar){
				maxSum =sumSoFar;
				index=i;
			}
		}
		return maxSum;
	}

}
