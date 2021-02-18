package com.studentavg;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet oTreeSet=new TreeSet();
		StudentEx s1=new StudentEx("ss",10,67,78,89);
		StudentEx s2=new StudentEx("dd",11,76,87,98);
		StudentEx s3=new StudentEx("ff",12,45,65,38);
		StudentEx s4=new StudentEx("gg",13,56,76,90);
		oTreeSet.add(s1);
		oTreeSet.add(s4);
		oTreeSet.add(s2);
		oTreeSet.add(s3);
		System.out.println(oTreeSet);
	}
}