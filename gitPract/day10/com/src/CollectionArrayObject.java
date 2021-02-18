package com.src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionArrayObject 
{

	public static void main(String[] args) 
	{
		ArrayList arrayList=new ArrayList();

		arrayList.add(12);
		arrayList.add(89);
		arrayList.add(58);

		ArrayList arrayList2=new ArrayList();

		arrayList2.add(452);
		arrayList2.add(90);
		arrayList2.add(158);
		arrayList2.add(arrayList);

		System.out.println(arrayList);
		System.out.println(Collections.min(arrayList));
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		Collections.swap(arrayList2, 3,1);
		System.out.println(arrayList2);

		Object[] objects=arrayList.toArray();

		Arrays.sort(objects);
		System.out.println(objects);
		Arrays.fill(objects, arrayList);
		System.out.println(objects);
		Arrays.hashCode(objects);
		System.out.println(objects);
	}
}
