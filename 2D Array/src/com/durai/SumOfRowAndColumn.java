package com.durai;

public class SumOfRowAndColumn {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
            };    
		int sum;
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("sum of "+(i+1)+" row "+sum);
		}
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[j][i];
			}
			System.out.println("sum of "+(i+1)+" column "+sum);
		}
	}

}
