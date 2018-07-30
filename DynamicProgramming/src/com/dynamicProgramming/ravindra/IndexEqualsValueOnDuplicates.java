package com.dynamicProgramming.ravindra;

public class IndexEqualsValueOnDuplicates {
  
	    static int magicIndex(int arr[], int start, int end)
	    {
	        // If No Magic Index return -1;
	        if (start > end)
	            return -1;
	     
	        int midIndex = (start + end) / 2;
	        int midValue = arr[midIndex];
	     
	        // Magic Index Found, return it.
	        if (midIndex == midValue)
	            return midIndex;
	     
	        // Search on Left side
	        int left = magicIndex(arr, start, Math.min(midValue,
	                                            midIndex - 1));
	     
	        // If Found on left side, return.
	        if (left >= 0)
	            return left;
	     
	        // Return ans from right side.
	        return magicIndex(arr, Math.max(midValue, 
	                                midIndex + 1),end);
	    }
	 
	    // Driver code
	    public static void main (String[] args) 
	    {
	        int arr[] = { -10, -5, 2, 2, 2, 3, 4, 7,
	                    9, 12, 13 };
	        int n = arr.length;
	        int index = magicIndex(arr, 0, n - 1);
	        if (index == -1)
	            System.out.print("No Magic Index");
	        else
	            System.out.print("Magic Index is : "+index);
	    }
	}
	 

