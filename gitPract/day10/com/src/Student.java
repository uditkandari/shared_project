package com.src;

public class Student {

	private int id;
	private String name;
	private String add;
	
	
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[id=" + id + "name=" +name+"add= " + add +" ]";
	}
	
	public Student(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the add
	 */
	public String getAdd() {
		return add;
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(String add) {
		this.add = add;
	}
	
	
	
}