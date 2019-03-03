package com.jspiders.Tressets;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		
		TreeMap m= new TreeMap<>();
		m.put(new Student(1, 56.3, "mmmm"), 1);
		m.put(new Student(2, 57.3, "mmmm"), 1);
		m.put(new Student(3, 57.3, "mmmm"), 1);
		 
	 Set s=m.keySet();// sorting based on marks will take place put will call compare to and it will be stored in sorted manner
	 for (Object object : s) {
		System.out.println(m.get(object));
	}
			
		
		
	
		
		
	}

}
