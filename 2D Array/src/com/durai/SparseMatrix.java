package com.durai;

public class SparseMatrix {

	public static void main(String[] args) {
		int a[][]= {{3,0,0},
					{0,1,0},
					{0,0,9}
					};
		int size=a.length*a[0].length;
			size=size/2;
			int count =0;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(a[i][j]==0) {
						count++;
					}
				}
			}
			if(count>size) {
				System.out.println("this is sparse matrix");
			}else {
				System.out.println("this is not sparse matrix");
			}
	}

}
