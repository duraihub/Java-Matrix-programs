package com.durai;

public class MatrixEqual {

	public static void main(String[] args) {
		int a[][]= {{9,4,5},
					{2,3,0},
					{1,7,8}};
		int b[][]= {{9,4,5},
					{2,3,0},
					{1,7,8}};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=b[i][j]) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("two matrix are equal");
		}else {
			System.out.println("two matrix are not equal");
		}
		
	}

}
