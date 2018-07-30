package com.dynamicProgramming.tusharRoy;

public class CostOfOptimalBST {

    public static int minCost(int input[], int freq[]){
        int T[][] = new int[input.length][input.length];
        
        for(int i=0; i < T.length; i++){
            T[i][i] = freq[i];
        }
        
        for(int l = 2; l <= input.length; l++){
            for(int i=0; i <= input.length-l; i++){
                int j = i + l -1;
                T[i][j] = Integer.MAX_VALUE;
                int sum = getSum(freq, i, j);
                
                for(int k=i; k <= j; k++){
                     int val = sum + (k-1 < i ? 0 : T[i][k-1]) +
                            (k+1 > j ? 0 : T[k+1][j]) ;
                     if(val < T[i][j]){
                         T[i][j] = val;
                     }
                }
            }
        }
        return T[0][input.length-1];
    }
    
    private static int getSum(int freq[], int i, int j){
        int sum = 0;
        for(int x = i; x <= j; x++){
            sum += freq[x];
        }
        return sum;
    }
	 
	    public static void main(String[] args) {
	         
	        int keys[] = { 10, 12, 20 };
	        int freq[] = { 34, 8, 50 };
	        System.out.println("Cost of Optimal BST is "
	                + minCost(keys, freq));
	    }
	 
	}

