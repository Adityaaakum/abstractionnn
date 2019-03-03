package com.jspiders.Tressets;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {
	public static void main(String[] args) {
		
	/*	HashMap h= new HashMap<>();
		h.put("hi", new Student(1, 35.3, "mmmm"));
		h.put(null, new Student(1, 35.3, "mmmm"));
		h.put(1, new Student(21, 36.3, "ccccc"));
	//	System.out.println(h.get(null));
		h.put(1, null);
	//	System.out.println(h.get(null));
	//	System.out.println(h.get("hi"));
	//	Set s=h.keySet();
		/*for ( Object ob: s) {
			System.out.println(h.get(ob));*///behaving like hashset ..no duplicates available
		
		HashMap hh= new HashMap<>();
		hh.put(new Student(1, 35.3, "hiii"), 1);
		hh.put(new Student(1,35.3 , "hiii"), 1);
		Set s1=hh.keySet();
		for (Object object : s1) {
			System.out.println(hh.get(object));
		
		
		
		
		
		
		
		
		
	}

}
}
