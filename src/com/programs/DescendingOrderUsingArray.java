package com.programs;

public class DescendingOrderUsingArray {

	public static void main(String[] args) {
		int temp;
		int a[]=  {50,80,60,10,90,40};
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Descending Order:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
