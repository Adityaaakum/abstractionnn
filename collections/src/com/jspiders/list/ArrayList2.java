package com.jspiders.list;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList e= new ArrayList();
		System.out.println(e.size());
		e.add(new Students(1, 56.3));
		e.add(new Employee(1, 30000));
		e.add(null);
		e.add(new Employee(1, 30000));
	
		System.out.println("size="+e.size());
		for(int i=0;i <e.size();i++ )
		{
			Object ob=e.get(i);
			if(ob instanceof Students)// explicit down casting requied if we want to show individual properties
			{
				Students s1=(Students)ob;
				System.out.println(((Students) ob).id);
				System.out.println(s1.marks);
				
			}
			else if(ob instanceof Employee)
			{
				Employee e1=(Employee)ob;
				System.out.println(e1.id);
				System.out.println(e1.sal);
			}
			else
				System.out.println(ob);
			}
		}
	}


