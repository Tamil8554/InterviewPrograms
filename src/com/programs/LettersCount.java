package com.programs;

public class LettersCount {
	public static void main(String[] args) {
	String s="Hello Everyone!! It's 9.00 AM.. Good Morning";
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)>='a' && s.charAt(i)<='z') {
			count++;
			}
		else if (s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
			count1++;
		}
		else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
			count2++;			
		}
		else {
			count3++;
		}
		}
	System.out.println("Number of small letters are :"+count);
	System.out.println("Number of capital letters are :"+count1);
	System.out.println("Number of numeric values are :"+count2);
	System.out.println("Number of special characters are :"+count3);
	

}}
