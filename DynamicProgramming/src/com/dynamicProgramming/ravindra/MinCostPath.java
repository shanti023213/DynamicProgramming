package com.dynamicProgramming.ravindra;

public class MinCostPath {

	public static void main(String[] args) {
		 int cost[][]= {{1, 2, 3},
				 		{4, 8, 2},
				 		{1, 5, 3}};
		 
		 int cost1[][]= {{10, 3, 4},
			 			 {5, 6, 7},
			 			 {13,4, 11}};
		 
		 int minCost = minimumCostPath(cost1);
		 System.out.println("Cost:"+minCost);

	}
	
	public static int minimumCostPath(int[][] cost){
		
		int[][] result = new int[cost.length][cost[0].length];
		
		result[0][0] = cost[0][0];
		for (int i=1;i<cost.length;i++){
			result[i][0] = result[i-1][0]+cost[i][0];
		}
		for (int i=1;i<cost[0].length;i++){
			result[0][i] = result[0][i-1]+cost[0][i];
		}
		
		for(int i=1;i<cost.length;i++){
			for(int j=1;j<cost[0].length;j++){
				
				result[i][j] = cost[i][j]+ Math.min(result[i-1][j],
										            Math.min(result[i-1][j-1], result[i][j-1]));
			}
		}
		return result[cost.length-1][cost[0].length-1];
		
	}

}
