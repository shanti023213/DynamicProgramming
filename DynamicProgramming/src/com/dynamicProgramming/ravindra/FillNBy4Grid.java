package com.dynamicProgramming.ravindra;

public class FillNBy4Grid {
// n*4 grid using 1*4 tiles
	public static void main(String[] args) {
		
		int n=5;
		int noOfWays = noOfWays(n);
		System.out.println("No.Of ways:" + noOfWays);

	}
	
	public static int noOfWays(int n){
		
		int[] dp = new int[n+1];
		
		for(int i=1;i<=n;i++){
			if(i<=3){
				dp[i] =1;
			}else if(i==4){
				dp[i]=2;
			}else{
			dp[i] = dp[i-1]+dp[i-4];
			}
		}
		
		return dp[n];
	}

}
