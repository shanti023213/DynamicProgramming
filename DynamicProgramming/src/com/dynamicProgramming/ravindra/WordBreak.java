package com.dynamicProgramming.ravindra;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		 Set<String> dictionary = new HashSet<String>();
	        dictionary.add("i");
	        dictionary.add("like");
	        dictionary.add("sam");
	        dictionary.add("sung");
	        dictionary.add("samsung");
	        dictionary.add("mobile");
	        dictionary.add("ice");
	        dictionary.add("cream");
	        dictionary.add("cream");
	        dictionary.add("man");
	        dictionary.add("go");
	        dictionary.add("mango");
	     
	        
	       String str = "samsungandmangok";
	        
	        boolean isWordBreak = wordBreak(str, dictionary);
	        System.out.println("isWordBreak:" +isWordBreak);

	}
	
	public static boolean wordBreak(String str, Set dictionary){
		boolean[][] a= new boolean[str.length()][str.length()];
		
		for(int i=0;i<a.length;i++){
			if(dictionary.contains(str.substring(i, i+1))){
				a[i][i]= true;
			}
		}
		
		for(int l=2;l<=str.length();l++){
			for(int i=0;i<str.length()-l+1;i++){
				int j = i+l-1;
				
				if(dictionary.contains(str.substring(i, j+1))){
					a[i][j] =true;
				}else{
					
					for(int k= i;k<j;k++){
						if(a[i][k] && a[k+1][j]){
							a[i][j] = true;
							break;
						}
					}
				}
				
			}
			
		}
		
		return a[0][str.length()-1];
	}

}
