package ie.lyit.testers;

import ie.lyit.bank.Employee;
import ie.lyit.bank.Date;
import ie.lyit.bank.Name;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employeeA = new Employee();
		
		System.out.print(employeeA);
		
		employeeA.setName(new Name ("Mr","Homer","Simpson"));
		employeeA.setAddress("742 Evergreen Terrace, Springfield");
		employeeA.setPhoneNumber("1234567890");
		employeeA.setDateOfBirth(new Date(25,12,2017));
		employeeA.setStartDate(new Date(25,12,2015));
		employeeA.setSalary(10000);
		
		System.out.print(employeeA);
		

	}
}