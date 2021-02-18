package com.stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamEx 
{

	public static void main(String[] args) 
	{

		List<StudentEx> studentlist = new ArrayList<StudentEx>(); 
		studentlist.add(new StudentEx(2,"shiv",23));      
		studentlist.add(new StudentEx(3,"ram",56));        
		studentlist.add(new StudentEx(4,"sita",87));        
		studentlist.add(new StudentEx(5,"udit",86));         
		studentlist.add(new StudentEx(80,"rohan",98));  
		System.out.println(" student name");
		List<String> names = studentlist.stream().map(n->n.studentName).collect(Collectors.toList());
		System.out.println(names);
		System.out.println(" greater 40 mark");
		List < StudentEx > sortedList = studentlist.stream().filter(s->s.getstudentMark() > 40).sorted(Comparator.comparingInt(StudentEx::getstudentMark)).collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(" greater 22 id");
		Set<StudentEx> students = studentlist.stream().filter(n-> n.studentId>22).collect(Collectors.toSet());

		for(StudentEx stu : students) 
		{ 
			System.out.println(stu.studentId+" "+stu.studentName+" "+stu.studentMark); 
		}

		System.out.println(" average mark of student");
		Double avgMark= studentlist.stream().collect(Collectors.averagingInt(s->s.studentMark));  
		System.out.println("Average mark of Students is: "+avgMark);

		System.out.println(" start with u ");
		List<StudentEx> firstStudent=studentlist.stream().filter((StudentEx s)-> s.studentName.startsWith("u")).collect(Collectors.toList());
		System.out.println("name of first student " + firstStudent);

		System.out.println("minimum mark");
		Comparator<StudentEx> mincomparator = Comparator.comparing( StudentEx::getstudentMark );	
		StudentEx minMarks = studentlist.stream().min(mincomparator).get();
		System.out.println("minimum marks is "+minMarks);

		System.out.println("max mark");
		Comparator<StudentEx> maxcomparator = Comparator.comparing( StudentEx::getstudentMark);
		StudentEx maxMarks = studentlist.stream().max(maxcomparator).get();
		System.out.println("maximum marks is "+maxMarks);

		System.out.println("descending order mark");
		List<StudentEx> sortedList1 = studentlist.stream().sorted(Comparator.comparingInt(StudentEx::getstudentMark).reversed()).collect(Collectors.toList());
		System.out.println(sortedList1);

		System.out.println("total student ");
		long totalstudent= studentlist.stream().count();
		System.out.println("totalStudent="+totalstudent);
	}




}
