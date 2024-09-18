package com.program;

import java.util.HashSet;

public class RemoveDuplicatevalueArray {
	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {  // Add to temp only if it's not already in the set
                temp[j++] = arr[i];
                set.add(arr[i]);
            }
        }
        
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }
}
