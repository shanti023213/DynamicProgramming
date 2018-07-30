package com.dynamicProgramming.ravindra;

public class FloydWarshall {

	public static void main(String[] args) {
		int[][] D0 = {{0,11,1,6},
					  {11,0,7,3},
					  {1,7,0,2},
					  {6,3,2,0}};
		
		int[][] finalMatrix = floydWarshall(D0);
		
		
		System.out.println("*********");

	}

	public static int[][] floydWarshall(int[][] D0){
		
		int[][] result = new int[D0.length][D0[0].length];
		for(int i=0;i<D0.length;i++){
			for(int j=0;j<D0[0].length;j++){
				result[i][j] = D0[i][j];
			}
		}
		
		for(int k=1;k<D0.length;k++){
			for(int i=0;i<D0.length;i++){
				for(int j=0;j<D0[0].length;j++){
					
					if(result[i][k]+result[k][j]<result[i][j]){
						result[i][j] = result[i][k]+result[k][j];
					}
				}
			}
			
		}
		return result;
	}
}
