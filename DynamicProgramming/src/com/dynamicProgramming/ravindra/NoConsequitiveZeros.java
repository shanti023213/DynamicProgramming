package com.dynamicProgramming.ravindra;

public class NoConsequitiveZeros {

	public static void main(String[] args) {
		
		int count = countStrings(5);
		System.out.println("Count:" + count);

	}
	
	public static int noConsequitiveZeros(int n){
		int[] arr = new int[n+1];
		arr[0] =0;
		arr[1] =2;
		arr[2] =3;
		
		for(int i=3;i<=n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	static  int countStrings(int n)
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }

}
