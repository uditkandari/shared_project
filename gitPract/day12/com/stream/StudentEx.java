package com.stream;

public class StudentEx {

	int studentId;
	String studentName;
	int studentMark;
	public StudentEx() {
		
	}
	@Override
	public String toString() {
		return "StudentEx [studentId=" + studentId + ", studentName=" + studentName + ", studentMark=" + studentMark + "]";
	}
	public StudentEx(int studentId, String studentName, int studentMark) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMark = studentMark;
	}
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getstudentMark() {
		return studentMark;
	}
	public void setstudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.studentId=studentId;
	}
	
}
