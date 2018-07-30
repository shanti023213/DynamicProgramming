package com.dynamicProgramming.ravindra;

public class NoSqaureMatrix {

	public static void main(String[] args) {
	
		int[][] matrix = {{1,1,1,1,1},{0,1,1,1,1},{1,1,1,1,1},{0,1,1,0,1},{0,0,1,1,1}};
		int squareMatrix = minSquareMatrix(matrix);
		System.out.println("Square Matrix:"+squareMatrix);

	}

	public static int minSquareMatrix(int[][] matrix){
		
		int[][] result = new int[matrix.length][matrix[0].length];
		int max = 0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				
				if(i==0 || j==0 || matrix[i][j]==0){
					result[i][j] =matrix[i][j];
				}else if(matrix[i][j] ==1){
					result[i][j] = 1+Math.min(result[i-1][j-1], Math.min(result[i-1][j], result[i][j-1]));
					
				}
				if(max<result[i][j]){
					max = result[i][j];
				}
			}
		}
		return max;
	}
}
