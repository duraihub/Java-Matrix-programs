package com.durai;

public class OddEvenCount {

	public static void main(String[] args) {
		int a[][] = {       
                {4, 1, 3},    
                {3, 5, 7},    
                {8, 2, 6}    
            };   
		int countEven=0;
		int countOdd =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					countEven++;
				}else {
					countOdd++;
				}
			}
		}
		System.out.println("Evencount "+countEven+"\nOddcount "+countOdd);
	}

}
