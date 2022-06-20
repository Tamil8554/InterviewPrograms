package com.programs;

import java.util.Scanner;

public class Swapping2Numbers {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a;
	a=b;
	b=c;
	
	System.out.println("Swapping numbers are");
	System.out.println(a);
	System.out.print(b);
	}

}
