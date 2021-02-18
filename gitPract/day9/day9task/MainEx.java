package day9task;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class MainEx 
{
	public static void main(String[] args) 
	{
		SortedSet oSortedSet=new TreeSet();
		NavigableSet oNavigableSet=new TreeSet();
		TreeMap oTreeMap=new TreeMap( new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2) 
			{
				Student s1=(Student) o1; 
				Student s2=(Student) o2;
				if(s1.getstudentId()>s2.getstudentId())
				{
					return 1;
				}
				else if(s1.getstudentId()<s2.getstudentId())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		});
		oTreeMap.put(new Student(10,"ud"),new Employee(15000,"udit"));
		oTreeMap.put(new Student(11,"dk"),new Employee(20000,"dhananjay"));
		oTreeMap.put(new Student(12,"ram"),new Employee(25000,"rama"));

		System.out.println(oTreeMap);
		Set set=oTreeMap.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"- "+entry.getValue());
		}

		System.out.println("SORTEDSET");

		oSortedSet.add(new Employee (1000,"raja"));
		oSortedSet.add(new Employee (1500,"rani"));
		oSortedSet.add(new Employee (2547,"choor"));
		oSortedSet.add(new Employee(8859,"siphai"));
		oSortedSet.add(new Employee (7759,"shyam"));
		oSortedSet.add(new Employee (3593,"lala"));
		System.out.println(oSortedSet);
		System.out.println(oSortedSet.first());
		System.out.println(oSortedSet.last());

		System.out.println("NAVIGABLESET");

		oNavigableSet.add(new Employee (3434,"bibi"));
		oNavigableSet.add(new Employee (76767,"poco"));
		oNavigableSet.add(new Employee (89898," primo"));
		oNavigableSet.add(new Employee(54554,"nita"));
		oNavigableSet.add(new Employee (324324,"gita"));
		oNavigableSet.add(new Employee (32343,"sita"));
		System.out.println(oNavigableSet);
		System.out.println(oNavigableSet.first());
		System.out.println(oNavigableSet.last());
		System.out.println(oNavigableSet.pollFirst());
		System.out.println(oNavigableSet.pollLast());
		System.out.println(oNavigableSet);
	}
}