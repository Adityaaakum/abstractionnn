package com.jspiders.list;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {
	public static void main(String[] args) {
		java.util.LinkedList l= new java.util.LinkedList();
		l.add(5);
		l.add(new Employee(1, 50000));
		l.add(new Students(1, 52));
		l.add(new Students(1, 52));
		l.add(new Employee(1, 4500));
		l.add(new Shopkeppers(1, 190000));
		l.add(new Sports(2, "cricket"));
		l.add(new Tution(45.3,"hindi" ));
		l.add(new Football(5, "mid"));
		l.add(null);
		l.add(null);
		Iterator t=l.listIterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		
		}
		System.out.println(l);
		ArrayList l1= new ArrayList();
		/*for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));*/
		l1.addAll(l);
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		
		
	}

}
