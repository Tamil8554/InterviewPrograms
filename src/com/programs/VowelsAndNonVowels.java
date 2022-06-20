package com.programs;

import java.util.Scanner;

public class VowelsAndNonVowels {

		public static void main(String[] args) {
			String s = "India";
			int Vowels=0;
			int NonVowels=0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c=='a'|| c=='A' || c=='e' || c=='E' || c=='i' || 
						c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
					Vowels++;
				} else {
                     NonVowels++;   
				}
				
			}
			System.out.println(Vowels);
			System.out.println(NonVowels);
			
			}
}
	