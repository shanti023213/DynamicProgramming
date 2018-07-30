package com.dynamicProgramming.tusharRoy;

public class MaxProductCutting {
	
	 public static void main(String args[]){
		 
	        System.out.println(maxProduct(13));
	    }
	 
	 
	 public static int maxProduct(int n){
		 
		 int[] arr = new int[n+1];
		 arr[0]= 1;
		 
		 for(int i=1;i<=n;i++){
			 arr[i] =i;
		 }
		 
		 for(int i=1;i<=n;i++){
			 
			 for(int j=1;j<=i;j++){
				 arr[i] = Math.max(arr[i], arr[j] *arr[i-j]);
			 }
		 }
		 return arr[n];
	 }
	 


}
