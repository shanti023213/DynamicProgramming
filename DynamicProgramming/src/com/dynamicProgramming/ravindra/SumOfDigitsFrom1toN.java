package com.dynamicProgramming.ravindra;

public class SumOfDigitsFrom1toN {

	public static void main(String[] args) {
		int n = 12345;
		System.out.println(sumOfNDigits(n));
	}
	
	public static int sumOfNDigits(int n){
		
		if(n<10){
			return n*(n+1)/2;
		}
		int d =(int) Math.log10(n);
		int p = (int)Math.pow(10, d);
		int msd = n/p;
		int[] a = new int[d+1];
		a[0] =0; a[1]=45;
		for(int i=2;i<=d;i++){
			a[i] = a[i-1]*10 + (45* (int)Math.pow(10, i-1));
		}
		
	
		 return (msd * a[d] + (msd * (msd - 1) / 2) * p +  
	              msd * (1 + n % p) + sumOfNDigits(n % p));
		
	}

}
