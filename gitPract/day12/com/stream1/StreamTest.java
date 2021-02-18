package com.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.stream.StudentEx;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentlist = new ArrayList<Student>(); 

		studentlist.add(new Student(2,"shiv",23));      
		studentlist.add(new Student(3,"ram",56));        
		studentlist.add(new Student(4,"sita",87));        
		studentlist.add(new Student(5,"udit",86));         
		studentlist.add(new Student(80,"rohan",98));
		long totalstudent= studentlist.stream().count();
		System.out.println("totalStudent="+totalstudent);
		System.out.println();
		List<String> failing =studentlist.stream().filter( s -> (s.mark < 50)).map( s -> (s.sid + " " + s.sname+" "+s.mark)).collect( Collectors.toList()); 
		System.out.println("Failing students: ");
		failing.stream().forEach( System.out::println );
		System.out.println();
		List<String> passing = studentlist.stream().filter(s -> (s.mark >50)).map( s -> (s.sid + " " + s.sname+" "+s.mark)).collect(Collectors.toList() );
		System.out.println("passing students: ");
		passing.stream().forEach( System.out::println );
		System.out.println();
		System.out.println("Data sorted by score:");
		List<String> l=studentlist.stream().sorted((s1,s2) -> s1.mark - s2.mark ).map(s -> (s.sid + " " + s.sname+" "+s.mark)).collect(Collectors.toList()) ;

		l.stream().forEach(System.out::println );
		System.out.println();
		System.out.println("Data sorted by student id:");
		List<String> li=studentlist.stream().sorted( (s1,s2) -> s1.sid - s2.sid).map(s -> (s.sid + " " + s.sname+" "+s.mark)).collect(Collectors.toList()) ;

		li.stream().forEach(System.out::println);
		System.out.println();

	}
}



