package com.programs;

import java.util.Scanner;

public class Palindrome_Check {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if (n==j) {
			System.out.println("Entered number is a Palindrome");
			
		} else {
			System.out.println("Entered number is not a Palindroem");

		}
	}
}
