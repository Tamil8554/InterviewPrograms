package com.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CountOfLettersInString {

	public static void main(String[] args) {
		String s = "TamilRajat";
		TreeMap<Character, Integer> emp = new TreeMap<Character,
		Integer>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
		if (emp.containsKey(c)) {
		int x = emp.get(c);
		emp.put(c, x + 1);
		} else {
		emp.put(c, 1);
		}
		}
		System.out.println(emp);
		}
	}


