package com.programs;

import java.util.Scanner;

public class FindOddOrEven {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter a Number");
	int n=sc.nextInt();
	if (n%2==0) {
		System.out.println("Entered value is an Even Number");
	} else {
		System.out.println("Entered value is an Odd Number");
	}
	}

}
