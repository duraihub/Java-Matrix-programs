package com.durai;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
			int a[][]= {{9,4,5},
						{2,3,6},
						{1,7,8}};
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(i<j) {
						System.out.print("0 ");
					}else {
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println();
			}
	}

}
