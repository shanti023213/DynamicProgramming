package com.dynamicProgramming.ravindra;

public class LargestCommonSubsequence {

	public static void main(String[] args) {
		
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	    StringBuffer s = new StringBuffer();
	    int lca = largestCommonSubsequence(s1,s2,s);
	    System.out.println("Size:"+lca+"String"+s.toString());
	}
	
	
	public static int largestCommonSubsequence(String s1, String s2, StringBuffer s){
		
		int[][] result = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<result.length;i++){
			
			for(int j=0;j<result[0].length;j++){
				
				if(i==0||j==0){
					result[i][j]=0;
				}else if(s1.charAt(i-1)==s2.charAt(j-1)){
					result[i][j] = 1+result[i-1][j-1];
				
				}else{
					result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
				}
			}
		}
		
		return result[result.length-1][result[0].length-1];
		
	}
	
	

}
