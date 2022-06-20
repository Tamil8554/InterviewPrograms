package com.programs;

import java.util.Scanner;

public class AmstrongNumber_Check {
	public static void main(String[] args) {
		int a,n,i=0,j=0;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=n;
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			System.out.println("");
			System.out.println("Entered Number is an Amstrong Number");
		} else {
			 System.out.println("Entered number is not an Amstrong Number"); 
			
		}
           
		
	
}}
