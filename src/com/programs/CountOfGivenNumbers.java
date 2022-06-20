package com.programs;

import java.util.Scanner;

public class CountOfGivenNumbers {

	public static void main(String[] args) {
		int a,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		while (a>0) {
			a=a/10;
			i++;
		}
System.out.println("Count is :"+i);
	}

}
