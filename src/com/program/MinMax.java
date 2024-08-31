package com.program;

public class MinMax {
	public static void main(String[] args) {
		int arr[] = {20, 5, 2, 10, 30};
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			} else if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
}
