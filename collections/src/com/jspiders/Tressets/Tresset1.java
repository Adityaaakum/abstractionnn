package com.jspiders.Tressets;

import java.util.TreeSet;

public class Tresset1 {
	public static void main(String[] args) {
// null cannot be inserted ,duplicates are allowed but of no use		
		TreeSet set=new TreeSet();
		set.add(new Student(1, 56.4, "hiii"));
		set.add(new Student(2, 89.3, "bye"));
		set.add(new Student(2,89.3, "Hiii"));
		
		System.out.println("sorting based on marks");
		for (Object object : set) {
			System.out.println(object);
			
		}
		TreeSet set2= new TreeSet( new SortingBasedOnName());
		
		set2.add(new Student(1, 56.4, "hiii"));
		set2.add(new Student(2, 89.3, "bye"));
		set2.add(new Student(2,89.3, "Hiii"));

		System.out.println("sorting based on name");
		for (Object object : set2) {
			System.out.println(object);
		}
				
			       
				
		
		
		
	}

}
