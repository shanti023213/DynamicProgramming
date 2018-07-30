package com.dynamicProgramming.ravindra;

public class Knapsack01 {

	public static void main(String args[])
	 {
	    int profit[] = new int[]{60, 100, 120};
	    int wt[] = new int[]{10, 20, 30};
	    int  totalWeight = 50;
	    int toalProfit = snapsack(profit,wt,totalWeight);
	    
	    System.out.println("Total Profit"+toalProfit);
	  }
	public static int snapsack(int[] profitArray, int[] weightArray, int totalWeight){
		
		int[][] result = new int[weightArray.length+1][totalWeight+1];
		
		for(int i=0;i<result.length;i++){
			
			for(int j=0;j<result[0].length;j++){
				
				if(i==0 || j==0){
					result[i][j]=0;
				}else if(weightArray[i-1]<=j){
					result[i][j] = Math.max((profitArray[i-1]+result[i-1][j-weightArray[i-1]]),result[i-1][j]);
				}else{
					result[i][j] =result[i-1][j];
				}
			}
		}
 		
		return result[result.length-1][result[0].length-1];
	}
	
}
