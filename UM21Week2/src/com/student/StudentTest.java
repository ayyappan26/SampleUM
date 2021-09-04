package com.student;

import java.util.HashMap;
import java.util.Set;

/**
 * @author ANatarajan
 * 
 */
class Employee {

	int empId;
	String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StudentTest {
	public static void main(String[] args) {
		HashMap<Integer, Employee> empMap = new HashMap<>();
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.setEmpId(100);
		emp1.setName("King");
		
		emp2.setEmpId(101);
		emp2.setName("King");
		
		emp3.setEmpId(102);
		emp3.setName("King");
		
		
		empMap.put(100, emp1);
		empMap.put(101, emp2);
		empMap.put(103, emp3);
		
				
		Employee empStatus = findEmployee(empMap, 1012);
		
		if(empStatus != null){
			System.out.println("Employee Found..");
		}else{
			System.out.println("Employee Not Found...");
		}
	}
	
	public static Employee findEmployee(HashMap<Integer, Employee> empMap,int empId){
		Employee emp = null;
		if(empMap.containsKey(empId)){
			emp = empMap.get(empId);
		}
		return emp;
	}
}
