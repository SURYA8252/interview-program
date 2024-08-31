package com.program;

import java.util.ArrayList;
import java.util.Collections;

public class DecendingOrderArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(10);
		lists.add(5);
		lists.add(20);
		lists.add(30);
		lists.add(2);
		Collections.sort(lists, Collections.reverseOrder());
		for(int result : lists) {
			System.out.println(result);
		}
	}
}
