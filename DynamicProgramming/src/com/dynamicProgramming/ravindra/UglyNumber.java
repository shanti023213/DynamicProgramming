package com.dynamicProgramming.ravindra;

public class UglyNumber {

	public static void main(String[] args) {
	
		System.out.println("150 Ugly Number: " + uglyNumber(150));
	}
	
	
	public static int uglyNumber(int n){
		
		int i=0;int j=0;int k=0;
		int[] u = new int[n];
		u[0] =1; int mult2 =2; int mult3=3;int mult5=5;
		
		for(int p=1;p<n;p++){
			u[p] = Math.min(mult2, Math.min(mult3, mult5));
			if(u[p] == mult2){
				++i;
				mult2 = u[i]*2;
			}
			if(u[p] == mult3){
				++j;
				mult3 = u[j]*3;
			}
			if(u[p] == mult5){
				++k;
				mult5 = u[k]*5;
			}
		}
		return u[n-1];
		
	}
	
}