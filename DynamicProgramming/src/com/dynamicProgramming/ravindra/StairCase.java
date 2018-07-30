package com.dynamicProgramming.ravindra;

public class StairCase {

	public static void main(String[] args) {
		int s = 4, m = 2;
        System.out.println("Nuber of ways = " + countWaysG(s, m));
	}
	
	
	//applicable only if 2 ways to claimb
	public static int countWays(int totalSteps, int stepsAtmax){
		
		int[] result = new int[totalSteps+1];
		
		result[0] =0;result[1]=1;result[2]=2;
		
		for(int i=3;i<=totalSteps;i++){
			result[i] = result[i-1]+result[i-2];
		}
		return result[totalSteps];
	}
	
	//Generalized way
	
	public static int countWaysG(int totalSteps, int stepsAtmax){
		
		int[] result= new int[totalSteps+1];
		result[0] =1 ; result[1]=1;
		
		for(int i=2;i<result.length;i++){
			result[i]= 0;
			
			for(int j=1;j<=i && j<=stepsAtmax ;j++){
				result[i] += result[i-j];
			}
		}
		return result[result.length-1];
	}     

}
