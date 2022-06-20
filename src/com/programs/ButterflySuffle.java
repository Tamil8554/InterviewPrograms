package com.programs;

public class ButterflySuffle {

	public static void main(String[] args) {
		int a[] = {0,2,3,4,8,5,6 };
		int len = a.length / 2;
		for (int i = len - 1; i >= 0; i--) {
		System.out.print(a[i]+" ");
		}
		for (int i = a.length - 1; i >= len; i--) {
		System.out.print(a[i]+" ");
		}

	}

}
