package com.family;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * This class is created to manipulate employee details
 * 
 * @author ANatarajan
 *
 */
public class EmployeeServices {

	/**
	 * This method is to get the user input for the employee registration
	 * 
	 * @return an employeeDTO Array
	 */
	public EmployeeDTO[] getUserDetails() {
		Scanner scan = EmployeeUtility.getScannerInstance();
		System.out.println("Enter how many users to be registered: ");
		int size = scan.nextInt();

		EmployeeDTO employeeDTO[] = new EmployeeDTO[size];
		EmployeeDTO empDto = null;
		for (int i = 0; i < size; i++) {

			empDto = new EmployeeDTO();
			System.out.println("Entering details of the employee - " + (i + 1));

			System.out.println("Enter Employee Id : ");
			empDto.setEmployee_id(scan.nextInt());

			System.out.println("Enter First Name : ");
			empDto.setFirst_name(scan.next());

			System.out.println("Enter Last Name : ");
			empDto.setLast_name(scan.next());

			System.out.println("Enter Salary : ");
			empDto.setSalary(scan.nextFloat());

			System.out.println("Enter Department: ");
			empDto.setDepartment(scan.next());

			employeeDTO[i] = empDto;
		}
		return employeeDTO;

	}

	public void printEmployeeDetails(EmployeeDTO[] empDetails) {
		System.out.println("Displaying Employee Details");

		EmployeeDTO empDto = null;
		for (int i = 0; i < empDetails.length; i++) {
			empDto = empDetails[i];
			System.out.println("Printing the information of employee - " + (i + 1));
			System.out.println("Employee Id : " + empDto.getEmployee_id());
			System.out.println("First Name : " + empDto.getFirst_name());
			System.out.println("Last Name : " + empDto.getLast_name());
			System.out.println("Salary : " + empDto.getSalary());
			System.out.println("Department : " + empDto.getDepartment());
			System.out.println("-------------------------------");
		}
	}


}
