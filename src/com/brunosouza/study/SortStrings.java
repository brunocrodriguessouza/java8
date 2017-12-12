package com.brunosouza.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Bruno");
		names.add("Dayani");
		names.add("Gabriel");
		names.add("Filipe");
		names.add("Miguel");
		names.add("Ana Julia");
		
		Collections.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
