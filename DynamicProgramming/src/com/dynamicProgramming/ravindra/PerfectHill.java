package com.dynamicProgramming.ravindra;

public class PerfectHill {

	public static void main(String[] args) {

        int arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
        int lengthOfperfectHill = perfectHillLength(arr);
        System.out.println("lengthOfperfectHill:"+lengthOfperfectHill);

	}
	
	public static int perfectHillLength(int[] arr){
		int[] lis = new int[arr.length];
		int[] lds = new int[arr.length];
		
		lis[0]=1; int count;
		for(int i=1;i<arr.length;i++){
			int j=i-1;count=1;
			while(j>=0){
				if(arr[i] >arr[j] && (count<lis[j]+1)){
					count = lis[j]+1;
				}
				j--;
			}
			
			lis[i] =count;
		}
		
		lds[arr.length-1] =1; int countLds;int j;
		for(int i=arr.length-2;i>=0;i--){
			 j=i+1;countLds=1;
			while(j<arr.length){
				if(arr[i]>arr[j] && countLds<lds[j]+1){
					countLds = lds[j]+1;
				}
				j++;
			}
			lds[i]= countLds;
		}
		
		int max =0; int index =0; int finalCount;
		for(int i=0;i<arr.length;i++){
			
			finalCount = (Math.min(lis[i], lds[i]) -1)*2 +1;
			if(finalCount>max){
				max=finalCount;
				index =i;
			}
		}
		return max;
	}

}
