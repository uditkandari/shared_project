package day9task;

public class Student implements Comparable 
{
	private int studentId;
	private String studentName;

	public Student() {	
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}

	public Student(int studentId, String studentName) {	
		this.studentId = studentId;
		this.studentName = studentName;		
	}

	@Override
	public String toString() 
	{
		return "student [studentId=" + studentId + ", studentName=" + studentName +"]";
	}

	public int getstudentId() 
	{
		return studentId;
	}
	public void setstudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	public String getstudentName() 
	{
		return studentName;
	}
	public void setstudentName(String studentName) 
	{
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student st=(Student) obj;
		return this.studentId==st.studentId;
	}

	@Override
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		Student s=(Student) o;
		if(this.studentId>s.studentId)
		{
			return 1;
		}
		else if(this.studentId<s.studentId)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
