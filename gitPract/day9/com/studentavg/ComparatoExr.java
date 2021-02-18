package com.studentavg;

import java.util.Comparator;

public  class ComparatoExr implements Comparator {

	
	public int compare(Object o1, Object o2) {
		StudentEx s1=(StudentEx)o1;
		StudentEx s2=(StudentEx)o2;
		if((s1.average()>=100)&&(s2.average()<=75))
		{
			return 1;
		}
		else if((s1.average()>35)&&(s2.average())>=0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}


	}
	
	

	
