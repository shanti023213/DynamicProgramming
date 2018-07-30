package com.dynamicProgramming.ravindra;

public class EvenLengthSubString {
	
	public static void main(String[] args) {
		
	String s = "3125308";
	System.out.println(lengthOfSub(s));
	}
	
	public static int lengthOfSub(String s){
		
		int[][] result = new int[s.length()][s.length()];
		
		for(int i=0;i<result.length;i++){
			result[i][i] = s.charAt(i) -'0';
		}
		
		int min =0;
		for(int l=2; l<=result.length;l++){
			
			for(int i=0;i<result.length-l+1;i++){
				
				int j = i+l-1;
				
				int k = (i+j)/2;
				result[i][j] =result[i][k]+result[k+1][j];
				
				if(l%2==0 && result[i][k]==result[k+1][j]){
					if(min<k){
						min =l;
					}
				}
			}
			
		}
		return min;
	}

	static int findLength(String str)
	{
	    int n = str.length();
	    int maxlen = 0; // Initialize result
	 
	    // A 2D table where sum[i][j] stores 
	    // sum of digits from str[i] to str[j]. 
	    // Only filled entries are the entries
	    // where j >= i
	    int sum[][] = new int[n][n];
	 
	    // Fill the diagonal values for 
	    // substrings of length 1
	    for (int i = 0; i < n; i++)
	        sum[i][i] = str.charAt(i) - '0';
	 
	    // Fill entries for substrings of
	    // length 2 to n
	    for (int len = 2; len <= n; len++)
	    {
	        // Pick i and j for current substring
	        for (int i = 0; i < n - len + 1; i++)
	        {
	            int j = i + len - 1;
	            int k = len/2;
	 
	            // Calculate value of sum[i][j]
	            sum[i][j] = sum[i][j-k] +
	                        sum[j-k+1][j];
	 
	            // Update result if 'len' is even,
	            // left and right sums are same
	            // and len is more than maxlen
	            if (len % 2 == 0 && sum[i][j-k] == 
	                sum[(j-k+1)][j] && len > maxlen)
	                maxlen = len;
	        }
	    }
	    return maxlen;
	}
}
