package com.programs;

import java.util.Scanner;

public class StudentsGrade {
	public static void main(String[] args) {
		System.out.println("Enter value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (100>=n && n>=90) {
			System.out.println("S Grade");
		}
		else if (89>=n && n>=80) {
			System.out.println("A Grade");
		}
		else if (79>=n && n>=70) {
			System.out.println("B Grade");
		}
		else if (69>=n && n>=60) {
			System.out.println("C Grade");
		}
		else if (59>=n) {
			System.out.println("Fail");
		}
	}
}
	