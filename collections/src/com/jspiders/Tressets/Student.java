package com.jspiders.Tressets;

public class Student implements Comparable 
{
	
	int id;
	double marks;
	String name;
	public Student(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	

	 @Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		 Student s=(Student)arg0;
		return this.id==s.id;
	}
	
	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		Student s=(Student)ob;
		return (int)((this.marks-s.marks )*(1000));
		
		
	}
	
	

	
	
}
