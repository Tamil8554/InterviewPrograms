package com.programs;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("Swapping numbers are");
	System.out.println(a);
	System.out.print(b);
	}

}
