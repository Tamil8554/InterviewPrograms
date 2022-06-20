package com.programs;

public class RemoveDuplicatesFromSortedArray {
public static void main(String[] args) {
	int a[]= new int[]{10,20,20,30,40,40,40};
	int temp[]=new int[a.length] ;
	int j=0;
	for (int i = 0; i < a.length-1; i++) {
		if (a[i] != a[i+1]) 
			temp[j++]=a[i];		
		}
	temp[j++]=a[a.length-1];
	for (int k = 0; k < j; k++) {
		System.out.println(temp[k]);
	}
	
	
}}	

