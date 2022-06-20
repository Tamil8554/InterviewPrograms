package com.programs;

public class PrintDuplicates {

	public static void main(String[] args) {
	   int a[]= new int[] {1,1,2,2,3,3,3,4,5,6};
	   int temp[]=new int[a.length];
	   int j=0;
	   for (int i = 0; i < a.length-1; i++) {
		if (a[i] == a[i+1]) {
			temp[j++]=a[i];
		}
	}
	   
		for (int k = 0; k <j; k++) {
			System.out.println(temp[k]);
		}
		
	}

}
