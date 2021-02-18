package com.src;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		arrayList.add(101);
		arrayList.add(105);
		arrayList.add(51);
		arrayList.add(501);
		arrayList.add(1);	

		System.out.println(arrayList);
		System.out.println(Collections.min(arrayList));
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		System.out.println(Collections.max(arrayList));

		List<Integer> list = Arrays.asList(2,3,4,6,3,1,2,2,6);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("Sorting with natural order");
		List<String> list2 = createList();
		list2.sort(null);
		list2.forEach(System.out::println);

		System.out.println("Sorting with a lamba expression for the comparison");
		List<String> list3 = createList();
		list3.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
		list3.forEach(System.out::println);

		System.out.println("Sorting with a method references");
		List<String> list4 = createList();
		list4.sort(String::compareToIgnoreCase);
		list4.forEach(System.out::println);


	}

	private static List<String>  createList() {
		return Arrays.asList("gowri", "rohini", "devi", "nilah");

	}

}