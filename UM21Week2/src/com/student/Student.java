package com.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student {
	public void calculateMarks() {
		try {
			int marks = 100;
			int per = 100 / 0; // throw new ArithmeticException()
		} catch (ClassCastException e) {
			System.out.println("Exception Caught here...");
		}
	}

	public void viewSemesterDetails() throws Exception {
	
		readFromTextFile();
		
	}

	public void readFromTextFile()throws Exception {
		File myFile = new File("D:\\Ayyappan\\Hi.txt");
		BufferedReader br = null;
		
			br = new BufferedReader(new FileReader(myFile));
			String str=br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}

	}
}
