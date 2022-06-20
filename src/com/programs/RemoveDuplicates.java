package com.programs;

public class RemoveDuplicates {

	public static int[] removeDuplicates(int[] input){
		int j = 0;
		int i = 1;
		//return if the array length is less than 2
		if(input.length < 2){
		return input;
		}
		while(i < input.length){
		if(input[i] == input[j]){
		i++;
		}else{
		input[++j] = input[i++];
		}
		}
		int[] output = new int[j+1];
		for(int k=0; k<output.length; k++){
		output[k] = input[k];
		}
		return output;
		}
		public static void main(String a[]){
		int[] input1 = {10,20,20,30,40,40,40};
		int[] output = removeDuplicates(input1);
		for(int i:output){
		System.out.println(i+" ");
		}
		}
}
