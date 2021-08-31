package com.student;

public class StudentTest {
	public static void main(String[] args) {
		
		try {
			new Student().viewSemesterDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Am in finally Block");
		}
	}
}
