package com.dynamicProgramming.ravindra;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		int[] a ={0,1,2};
		ArrayList<ArrayList<Integer>> list = findAllSubSets(a,0);

	}
	
	
	public static ArrayList<ArrayList<Integer>> findAllSubSets(int[] a, int index){
		
		if(index>a.length-1){
			
			ArrayList<ArrayList<Integer>> allsubsets =new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
			return allsubsets;
		}
		ArrayList<ArrayList<Integer>> list = findAllSubSets(a,index+1);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.addAll(list);
		for(ArrayList<Integer> list1: list){
			ArrayList<Integer> subList = new ArrayList<Integer>();
			subList.add(a[index]);
			subList.addAll(list1);
			
			result.add(subList);
		}
		
		
		return result;
	}

}
