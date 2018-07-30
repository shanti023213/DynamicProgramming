package com.dynamicProgramming.ravindra;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,1,4,1};
		int[][] result = matrixMul(a);
		
		System.out.println("Result"+result);
	}

	public static int[][] matrixMul(int[] a){
		
		int[][] result = new int[a.length][a.length];
		int[][] split = new int[a.length][a.length];
		
		for(int i=1;i<a.length;i++){
			result[i][i] = 0;
		}
		
		int q;
		
		for(int l=2; l<a.length;l++){
			
			for(int i=1; i<a.length-l+1;i++){
				int j = i+l-1;
				
				result[i][j]= Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++){
					q= result[i][k]+result[k+1][j]+a[i-1]*a[k]*a[j];
					if(q<result[i][j]){
						
						result[i][j]=q;
						split[i][j]=k;
					}
				}
				
				
			}
		}
		
		return result;
	}
	
	 static int[][] MatrixChainOrder(int p[])
	    {
		 
		 
		 int n= p.length;
	        /* For simplicity of the program, one extra row and one
	        extra column are allocated in m[][].  0th row and 0th
	        column of m[][] are not used */
	        int m[][] = new int[n][n];
	 
	        int i, j, k, L, q;
	 
	        /* m[i,j] = Minimum number of scalar multiplications needed
	        to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
	        dimension of A[i] is p[i-1] x p[i] */
	 
	        // cost is zero when multiplying one matrix.
	        for (i = 1; i < n; i++)
	            m[i][i] = 0;
	 
	        // L is chain length.
	        for (L=2; L<n; L++)
	        {
	            for (i=1; i<n-L+1; i++)
	            {
	                j = i+L-1;
	                if(j == n) continue;
	                m[i][j] = Integer.MAX_VALUE;
	                for (k=i; k<=j-1; k++)
	                {
	                    // q = cost/scalar multiplications
	                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
	                    if (q < m[i][j])
	                        m[i][j] = q;
	                }
	            }
	        }
	 
	        return m;
	    }
}
