package com.jspiders.list;

public class Tution {
	double syllabus;
	String syllb;
	@Override
	public String toString() {
		return "Tution [syllabus=" + syllabus + ", syllb=" + syllb + "]";
	}
	public Tution(double syllabus, String syllb) {
		super();
		this.syllabus = syllabus;
		this.syllb = syllb;
	}

}
