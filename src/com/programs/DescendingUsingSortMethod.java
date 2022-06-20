package com.programs;

import java.util.Arrays;

public class DescendingUsingSortMethod {

	public static void main(String[] args) {
		int a[]=new int[] {40,10,50,35,60,90,80};
		Arrays.sort(a);
		for (int i = a.length-1; i>0; i--) {
			System.out.println(a[i]);
			
		}
		
	
	
	
	
	}

}
