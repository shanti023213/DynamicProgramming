package com.dynamicProgramming.ravindra;

public class SubsetSum {

	public static void main(String[] args) {
			int set[] = {3, 34, 4, 12, 5, 2};
		    int sum = 9;
		
			//int set[] = {6,3,2,1};
	        //int sum = 5;
		    
		    boolean subsetSumPossible = subsetSum(set,sum);
		    System.out.println("*******: "+subsetSumPossible);

	}
	
	public static boolean subsetSum(int[] set, int sum){
		
		boolean[][] result = new boolean[set.length+1][sum+1];
		
		for(int i=0;i<result[0].length;i++){
			result[0][i]=false;
		}
	
		for(int i=1;i<result.length;i++){
			for (int j = 0; j < result[0].length; j++) {
				if (j == 0) {
					result[i][j] = true;
					continue;
				}
				if (set[i - 1] > j) {
					result[i][j] = result[i - 1][j];
				} else {

					result[i][j] = result[i - 1][j - set[i - 1]] || result[i - 1][j];
				}

			}
			}
		
		return result[result.length-1][result[0].length-1];
	}

}
