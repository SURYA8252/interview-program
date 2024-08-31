package com.program;

import java.util.ArrayList;
import java.util.Collections;

public class AccendingOrderArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Volkswagen");
		list.add("Toyota");
		list.add("Tata");
		Collections.sort(list);
		System.out.println(list);
	}
}
