package com.studentavg;
import java.lang.Comparable;
public class StudentEx implements Comparable 
{
	private String studentname;
	private int id;
	private int total;
	private double average;
	private int m,p,c;

	public StudentEx(String studentname, int id, int m, int p, int c) 
	{

		this.studentname = studentname;
		this.id = id;
		this.m = m;
		this.p = p;
		this.c = c;
	}

	int total()
	{
		int r=m+p+c;
		return r;
	}

	public double average()
	{
		return total()/3;
	}



	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		StudentEx s=(StudentEx)obj;
		return this.id==s.id;
	}
	public String getStudentname()
	{
		return studentname;
	}
	public void setStudentname(String studentname)
	{
		this.studentname = studentname;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getM() 
	{
		return m;
	}
	public void setM(int m) 
	{
		this.m = m;
	}
	public int getP()
	{
		return p;
	}
	public void setP(int p) 
	{
		this.p = p;
	}
	public int getC()
	{
		return c;
	}
	public void setC(int c) 
	{
		this.c = c;
	}
	@Override
	public int compareTo(Object o) 
	{
		
		StudentEx s1=(StudentEx)o;
		if(this.total()>s1.total())
		{
			return 1;
		}
		else if(this.total()<s1.total())
		{
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() 
	{
		return "Student [studentname=" + studentname + ", id=" + id + ", total=" + total() + ", average=" + average() + ", m="+ m + ", p=" + p + ", c=" + c + "]";
	}
}

