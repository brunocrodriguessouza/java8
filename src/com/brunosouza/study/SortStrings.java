package com.brunosouza.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		Comparator<String> comparatorBySize = new ComparatorBySize();
		Collections.sort(names, comparatorBySize);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}


class ComparatorBySize implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
}

