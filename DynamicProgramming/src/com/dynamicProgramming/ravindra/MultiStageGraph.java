package com.dynamicProgramming.ravindra;

public class MultiStageGraph {
	
	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		int[][] arr = {{0,1,2,5,INF,INF,INF,INF},
					   {INF,0,INF,INF,4,11,INF,INF},
					   {INF,INF,0,INF,9,5,16,INF},
					   {INF,INF,INF,0,INF,INF,2,INF},
					   {INF,INF,INF,INF,0,INF,INF,2},
					   {INF,INF,INF,INF,INF,0,INF,13},
					   {INF,INF,INF,INF,INF,INF,0,2},
					   {INF,INF,INF,INF,INF,INF,INF,0},
					  };


		int shortestDistance = shortestDistance(arr);
		
		System.out.println("Distance:"+shortestDistance);
	}

	
	public static int shortestDistance(int[][] arr){
		
		int[] result = new int[arr.length];
		
		result[arr.length-1]=0; int minvalue;
		for(int i=arr.length-2;i>=0;i--){
			result[i]  = Integer.MAX_VALUE;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i][j]==INF){
					continue;
				}
				minvalue = arr[i][j]+result[j];
				if(minvalue <result[i]){
					result[i] = minvalue;
				}
			}
			
		}
		return result[0];
	}
}
