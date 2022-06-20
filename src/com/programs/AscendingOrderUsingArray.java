package com.programs;

import java.util.Scanner;

public class AscendingOrderUsingArray {

	public static void main(String[] args) {
		int temp;
		int a[]=new int [] {40,10,60,30};
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
