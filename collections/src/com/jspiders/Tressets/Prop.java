package com.jspiders.Tressets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) {
		String s= "C://Users//pravash//Desktop//New folder (2)//prop.properties";// we can use forward slash too
		File f= new File(s);
		FileInputStream fi=null;
		Properties pro=null;
	try {
		fi = new FileInputStream(f);
		pro= new Properties();
		pro.load(fi);
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
	} catch ( IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		
		try {
			fi.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
