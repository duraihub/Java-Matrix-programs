package com.durai;

public class TransposeMatrix {

	public static void main(String[] args) {
		 int a[][] = {    
                 {1, 2, 3},    
                 {4, 5, 6}   
              }; 
		 int rows=a.length;
		 int cols=a[0].length;
		 int t[][]=new int[cols][rows];
		 
		 for(int i=0;i<cols;i++) {
			 for(int j=0;j<rows;j++) {
				 t[i][j]=a[j][i];
				 System.out.print(t[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
	}

}
