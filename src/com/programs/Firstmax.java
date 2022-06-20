package com.programs;

public class Firstmax {
	public static void main(String[] args) {
		int temp=0;
		int a[]={-12,45,-23,64,-100,24};
		for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
		if(a[i]>a[j]){
		temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		}
		}
		}
		
		System.out.println("The first maximum number is  " +
		a[a.length-1] );
		}
}
