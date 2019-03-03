package com.jspiders.list;

public class Employee {
	int id;
	double sal;
	public Employee(int id, double sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
	return id;
	}
	@Override
	public boolean equals(Object obj) {
		       Employee e=(Employee)obj;
		       return this.id==e.id;
	}
	

}
