package com.programs;

public class SumOfGivenNumbers {

	
		int sum = 0;
		public int getNumberSum(int number){
		if(number == 0){
		return sum;
		} else {
		sum += (number%10);
		getNumberSum(number/10);
		}
		return sum;
		}
		public static void main(String [] args){
		SumOfGivenNumbers a = new SumOfGivenNumbers();
		System.out.println("Sum is: "+a.getNumberSum(5678));
		}
}
