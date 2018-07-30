package com.dynamicProgramming.ravindra;

public class PartitionProblem {

	public static void main(String[] args) {
		int arr[] = {4,10,5,15,3,1};
		boolean isPartitioned = partitionProblem(arr);
		System.out.println("isPartitioned:"+isPartitioned);
         
	}
	
	public static boolean partitionProblem(int[] arr){
		
		int sum= 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		
		if(sum%2 != 0)
		{
			return false;
		}
		
		int requiredSum = sum/2;
		boolean[][] result = new boolean[arr.length+1][requiredSum+1];
		
		for(int i=0;i<result[0].length;i++){
			result[0][i] = false;
		}
		result[0][0] = true;
		for(int i=1;i<result.length;i++){
			for(int j=0;j<result[0].length;j++){
				
				if(j==0){
					result[i][j] = true;
					continue;
				}
				
				if(arr[i-1]>j){
					result[i][j] = result[i-1][j];
				}else{
					result[i][j] = result[i-1][j-arr[i-1]] || result[i-1][j];
				}
			}
		}
		
		return result[result.length-1][result[0].length-1];
	}

}
