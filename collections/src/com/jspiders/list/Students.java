package com.jspiders.list;

public class Students {
	int id;
	double marks;
	public Students(int id, double marks) {
		super();
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Students s=(Students)obj;
		return this.id==s.id;
	}
	

}
