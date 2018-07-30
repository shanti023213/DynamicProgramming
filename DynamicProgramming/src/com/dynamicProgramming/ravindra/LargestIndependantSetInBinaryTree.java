package com.dynamicProgramming.ravindra;




public class LargestIndependantSetInBinaryTree {
	
	 static class node 
	    {
	        int data, liss;
	        node left, right;
	 
	        public node(int data) 
	        {
	            this.data = data;
	            this.liss = 0;
	        }
	    }


	 public static void main(String[] args) 
	    {
	        // Let us construct the tree given 
	        // in the above diagram
	         
	        node root = new node(20);
	        root.left = new node(8);
	        root.left.left = new node(4);
	        root.left.right = new node(12);
	        root.left.right.left = new node(10);
	        root.left.right.right = new node(14);
	        root.right = new node(22);
	        root.right.right = new node(25);
	        System.out.println("Size of the Largest Independent Set is " + liss(root));
	    }
	 
	 public static int liss(node node){
		 
		 if(node==null){
			 return 0;
		 }
		 
		 if(node.left == null && node.right==null){
			 return 1;
		 }
		 
		 int lissExclude  = liss(node.left)+liss(node.right); 
		 int lissInclude = 1;
				 
		 if(node.left !=null){
			 lissInclude  += liss(node.left.left) + liss(node.left.right);
		 }
		 if(node.right!= null){
			 lissInclude  += liss(node.right.left) + liss(node.right.right);
		 }
		 
		 return Math.max(lissExclude, lissInclude);
		 
	 }

}
