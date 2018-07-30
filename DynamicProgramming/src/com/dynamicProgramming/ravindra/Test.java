package com.dynamicProgramming.ravindra;

public class Test {

	public static void main(String args[])
	{
	    int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
	    int size = arr.length;
	    System.out.println("Maximum Obtainable Value is " +
	                        cutRod(arr));
	}
	
	public static int cutRod(int[] arr){
		
		int[] result = new int[arr.length+1];
		
		result[0] =0;
		result[1] =arr[0];
		
		for(int i=2;i<result.length;i++){
			result[i] = arr[i-1];
			for(int j=0;j<i;j++){
				result[i] = Math.max(result[i], result[i-j] + result[j]);
			}
		}
		
		return result[result.length-1];
		
	}
}