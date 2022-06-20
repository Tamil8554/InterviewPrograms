package com.programs;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int n,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the table");
		n=sc.nextInt();
		System.out.println("table upto");
		j=sc.nextInt();
		for (int i = 1; i <=j; i++) {
			int c=n*i;
			System.out.println(i+"*"+j+"="+c);
		}
}}
	