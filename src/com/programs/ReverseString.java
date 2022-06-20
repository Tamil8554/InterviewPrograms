package com.programs;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	System.out.println("Enter a word");
	Scanner sc=new Scanner(System.in);
	String original=sc.nextLine();
	String reverse="";
	int length = original.length();
	for (int i = length-1 ; i >=0; i--) {
		reverse=reverse+original.charAt(i);
			}
	System.out.println(reverse);
}
}
