package com.dynamicProgramming.ravindra;

public class FabonacciSeries {
	
	
	public static void main(String[] args){
		
		int[] series = first20Series(20);
		System.out.println("Series");
		int a = fab20recursion(20);
		System.out.println("Series");
		//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765]
		
	}
	
	public static int[] first20Series(int n){
		int[] series = new int[n+1];
		series[0] =0;
		series[1]=1;
		
		for(int i=2;i<=n;i++){
			series[i] = series[i-1]+series[i-2];
		}
		return series;
	}
	
	public static int fab20recursion(int n){
	
		if(n<=1){
			return n;
		}
		return fab20recursion(n-1)+fab20recursion(n-2);

	}
	

	
}
