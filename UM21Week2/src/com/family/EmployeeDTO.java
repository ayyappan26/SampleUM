package com.family;

import java.util.Date;

/**
 * This class is created to store employee details
 * 
 * @author ANatarajan
 * @since 30th Aug 2021
 *
 */
public class EmployeeDTO {
	int employee_id;
	String first_name;
	String last_name;
	float salary;
	String department;
	Date dob;

	/**
	 * This mehtod retunrs an employee id
	 * 
	 * @return
	 */
	public int getEmployee_id() {
		return employee_id;
	}

	/**
	 * This method sets an employee id
	 * 
	 * @param employee_id
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
