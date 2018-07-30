package com.dynamicProgramming.ravindra;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {5,2,8,12,16,23,38,50,72,91};
		int searchElement = binarySearch(arr,91);
		
		if(searchElement==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("element Found at Index:"+searchElement);
		}
	}
	
	public static int binarySearch(int[] arr,int element){
		
		int l=0; int r = arr.length-1;
		int mid;
		
		while(l<=r){
			
			mid = (l+r)/2;
			
			if(element== arr[mid]){
				return mid;
			}else if(element<arr[mid]){
				r=mid-1;
			}else if(element>arr[mid]){
				l=mid+1;
			}
		}
		
		return -1;
	}

}
