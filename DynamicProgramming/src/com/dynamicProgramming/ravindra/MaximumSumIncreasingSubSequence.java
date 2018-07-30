package com.dynamicProgramming.ravindra;

public class MaximumSumIncreasingSubSequence {

	public static void main(String[] args) {
		
		int[] arr = {1, 101, 2, 3, 100, 4, 5};
		int increasingSum = maxSumIncreasingSubSequence(arr);
		System.out.println("Sum:"+increasingSum);
	}
	
	public static int maxSumIncreasingSubSequence(int[] arr){
		
		int[] result = new int[arr.length];
		result[0] = arr[0]; int finalMax = 0;
		
		for(int i=1;i<arr.length;i++ ){
			int j=i-1;
			int count = arr[i]; int max = arr[i];
			while(j>=0){
				if(arr[i]>arr[j]){
					count = result[j]+arr[i];
				}
				if(max<count){
					max = count;
				}
				j--;
			}
			result[i] = max;
			
			if(finalMax <max){
				finalMax = max;
			}
		}
		return finalMax;
	}

}
