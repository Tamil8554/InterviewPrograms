package com.programs;

import java.util.Scanner;

public class ReverseUsingAppend {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Word");
	String s= sc.next();
	StringBuilder b= new StringBuilder();
	StringBuilder append = b.append(s);
	StringBuilder reverse = append.reverse();
	System.out.println(reverse);
}
}
