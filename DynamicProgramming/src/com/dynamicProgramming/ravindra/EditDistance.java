package com.dynamicProgramming.ravindra;

public class EditDistance {

	public static void main(String[] args) {
		 String str1 = "";
	        String str2 = "saturday";
	        System.out.println("Min Operations:"+editDistance(str1,str2));

	}

	public static int editDistance(String str1, String str2){
		
		if(str1==null && str2==null){
			return 0;
		}
		
		int[][] c = new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				
				if(i==0){
					c[i][j] = j;
				}else if(j==0){
					c[i][j] =i;
				}else if(str1.charAt(i-1) == str2.charAt(j-1)){
					c[i][j] = c[i-1][j-1];
				}else{
					
					c[i][j] = Math.min((1+c[i-1][j]), Math.min((1+c[i-1][j-1]), (1+c[i][j-1])));
				}
				
			}
		}
		return c[c.length-1][c[0].length-1];
	}
}
