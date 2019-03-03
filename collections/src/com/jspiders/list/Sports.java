package com.jspiders.list;

public class Sports {
	int sports;
	String sportsname;
	public Sports(int sports, String sportsname) {
		super();
		this.sports = sports;
		this.sportsname = sportsname;
	}
	@Override
	public String toString() {
		return "Sports [sports=" + sports + ", sportsname=" + sportsname + "]";
	}
	

}
