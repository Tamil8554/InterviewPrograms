package com.programs;

import java.util.Scanner;

public class AmstrongNumber_Count {
	public static void main(String[] args) {
		int count=0;
		for (int n = 0; n <1000; n++) {
			
		int a,i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			count++;
		} 
	
}
		System.out.println(count);
		
}}
