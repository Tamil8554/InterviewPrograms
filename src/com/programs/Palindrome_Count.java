package com.programs;

import java.util.Scanner;

public class Palindrome_Count {
	public static void main(String[] args) {
		int count=0;
	for (int n = 0; n < 23; n++) {
		int a, i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if (n==j) {
			count=count+1;
		}
		
	}
	System.out.println(count);
		
	
}}
