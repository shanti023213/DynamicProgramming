package com.dynamicProgramming.ravindra;

public class CoinChange {

	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3};
		int sum =5;
		int noOfways = NoOfWaysOfSumPossible(arr,sum);
		System.out.println("No Of Ways:" + noOfways);
	}
	
	public static int NoOfWaysOfSumPossible(int [] arr, int sum){
		
		int result[][] = new int[arr.length+1][sum+1];
		
		// Need not do this step by default int array values wll be Zero
		for(int i=0;i<result.length;i++){
			result[0][i] =0;
		}
		for(int i=1;i<result.length;i++){
			for(int j=0;j<result[0].length;j++){
				
				if(j==0){
					result[i][j]= 1;
					continue;
				}
				if(arr[i-1]>j){
					result[i][j] = result[i-1][j];
				}else{
					result[i][j] = result[i-1][j]+result[i][j-arr[i-1]];
				}
			}
		}
		return result[result.length-1][result[0].length-1];
	}

}
