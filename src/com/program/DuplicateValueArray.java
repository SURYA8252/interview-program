package com.program;

public class DuplicateValueArray {
	public static void main(String[] args) {
		int arr[] = {10, 10, 20, 20, 30, 40};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(" " + arr[i]);
				}
			}
		}
	}
}
