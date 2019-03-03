package com.jspiders.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		
		HashSet s= new HashSet();
		//only homogeneous are required to add in order to remove duplicates
		
	s.add(new Students(1, 56.3));
	s.add(new Students(1, 56.3));
		s.add(null);
	s.add(new Employee(10, 52.3));
		s.add(new Employee(10, 52.3));
	/*	s.add(new Shopkeppers(2, 52000));
		s.add(new Tution(520, "hindi"));
		s.add(new Sports(1, "footb"));
		s.add(new Football(90, "mid"));
		s.add(new Shopkeppers(2, 52000));
	/*	s.add(null);
		s.add(5);
		s.add(5);
		s.add(6);
		s.add(2.3);*/
		Iterator t=s.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		
		}
		System.out.println(s);
				
	

		
	}

}
