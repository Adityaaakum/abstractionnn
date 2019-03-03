package com.jspiders.list;

public class Football {
	int time;
	String pos;
	@Override
	public String toString() {
		return "Football [time=" + time + ", pos=" + pos + "]";
	}
	public Football(int time, String pos) {
		super();
		this.time = time;
		this.pos = pos;
	}
	@Override
	public int hashCode() {
	return time;
	}
	@Override
	public boolean equals(Object obj) {
		           Football b=(Football)obj; 
		return this.time==b.time;
	}

}
