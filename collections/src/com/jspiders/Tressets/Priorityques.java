package com.jspiders.Tressets;

import java.util.PriorityQueue;

public class Priorityques {
	public static void main(String[] args) {
		
		PriorityQueue ss= new PriorityQueue();
		ss.add(new Student(1, 89.3, "aditya"));
		ss.add(new Student(2, 56.3, "hey"));
		ss.add(new Student(3, 62.3, "sssss"));
		ss.add(new Student(5, 19.3, "AAAAA"));
		//ss.add(null); null cannot be inserted in priority ques,duplicates are allowed
		int b=ss.size();
		for (int i = 0; i <b; i++) {
			System.out.println(ss.poll());
			
		}
		PriorityQueue ss1= new PriorityQueue<>( new SortingBasedOnName());
		ss1.add(new Student(1, 89.3, "aditya"));
		ss1.add(new Student(2, 56.3, "hey"));
		ss1.add(new Student(3, 62.3, "sssss"));
		ss1.add(new Student(5, 19.3, "AAAAA"));
		System.out.println("sorting based on names");
		for (int i = 0; i <b; i++) {
			System.out.println(ss1.poll());
			
		}
		
	
		
		
	}

}
