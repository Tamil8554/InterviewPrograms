package com.programs;

public class MyBinarySearch {

	public int binarySearch(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
		int mid = (start + end) / 2;
		if (key == inputArr[mid]) {
		return mid;
		}
		if (key < inputArr[mid]) {
		end = mid - 1;
		} else {
		start = mid + 1;
		}
		}
		return -1;
		}
		public static void main(String[] args) {
		MyBinarySearch mbs = new MyBinarySearch();
		int[] arr = {2,5,6,1,9,8,7};
		System.out.println("Key 4's position: "+mbs.binarySearch(arr, 1)); 
		

}
}