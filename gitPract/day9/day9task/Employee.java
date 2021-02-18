package day9task;

public class Employee implements Comparable 
{
	private int salary;
	private String ename;

	public Employee(int salary, String ename) 
	{
		this.salary = salary;
		this.ename = ename;
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		// TODO Auto-generated method stub
		return this.salary==e.salary;
	}

	@Override
	public int hashCode() 
	{
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String toString()
	{
		return "Employee [salary=" + salary + ", ename=" + ename + "]";
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getEname() 
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	@Override
	public int compareTo(Object o) 
	{
		Employee e=(Employee) o;
		return salary;
	}



}