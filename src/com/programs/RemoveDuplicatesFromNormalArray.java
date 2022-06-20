package com.programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromNormalArray {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,20,30,40,40,40,10,20};
		
		Set<Integer> s=new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
        System.out.println(s);
		
	}

}
