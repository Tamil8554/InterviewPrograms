package com.programs;

import java.util.Scanner;

public class PrimeNumbers_Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int count=0;
		for (int i = 2; i <n/2; i++) {
			if (n%i==0) {
				count=1;
			}
			}
		
			if (count==0) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a Prime Number");
		}
	}
}
