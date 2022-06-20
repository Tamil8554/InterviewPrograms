package com.programs;

import java.util.Scanner;

public class PalindromeString_Check {
public static void main(String[] args) {
	String original;
	String reverse="";
	System.out.println("Enter a word");
	Scanner sc=new Scanner(System.in);
	original=sc.next();
	int length=original.length();
	for (int i = length-1; i >=0; i--) {
         reverse=reverse+original.charAt(i);
	}
	if (original.equals(reverse)) {
		System.out.println("Entered word is a Palindrome");
	}
	else {
		System.out.println("Entered word is not a Palindrome");
	}
}
}
