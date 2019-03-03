package com.jspiders.list;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		//System.out.println("size before adding"+e.size);
		ArrayList e= new ArrayList();
		System.out.println("size before adding"+e.size());
		e.add(new Students(1, 5.666));
		e.add(new Students(2, 87.5));
		e.add("Hiii");
		e.add(new Employee(1, 4500));
		e.add(new Shopkeppers(1, 190000));
		e.add(new Sports(2, "cricket"));
		e.add(new Tution(45.3,"hindi" ));
		e.add(null);
		e.add(null);
		System.out.println(e);
		System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i));
			
		}
		
	}

}
