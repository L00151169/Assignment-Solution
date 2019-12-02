package ie.lyit.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee e1;
	
	@Before
	public void setUp() throws Exception {
		e1=new Employee();
	
	}
	
	
	@Test
	public void testToString() {
		String employee1 = "  ,1/1/1900,Employee Number: 2,Start Date: 1/1/1900,Salary: 0.0";
		assertEquals("test", employee1, e1.toString());	
	}


	@Test
	public void testEmployee() {
		Name n = new Name();
		e1.setName(n);
		assertEquals("Name should be " + n,n,e1.getName());
		Date dob = new Date();
		e1.setDateOfBirth(dob);
		assertEquals("Date of Birth should be " + dob,dob,e1.getDateOfBirth());
		Date setd = new Date();
		e1.setStartDate(setd);
		assertEquals("Start date of employee should be " + setd,setd,e1.getStartDate());
		assertEquals("Salary should be 0" , 0 ,e1.getSalary(),0);

	}// all these test all the attributes of employee such as name,date of birth, start date and salary 

	
	

	@Test
	public void testCalculateWage() {
		double salary = 60000; // wage per month
		double taxpercents = 5.0; // taxation of 5%
		double wage = (salary /12) - ((salary /12)) * (taxpercents /100); // salary - tax = total actual salary received
		e1.setSalary(salary);
		assertEquals("Wage should be " + wage, wage, e1.calculateWage(taxpercents), 0);
	} // 
	
	@Test
	public void testIncrementSalary() {
		e1.setSalary(60000); 
		e1.incrementSalary(6969);
		assertEquals("Salary should be" + (60000 +6969), 60000 + 6969, e1.getSalary(), 0);
		
	}


	@Test
	public void testSetSalary() {
		
		e1.setSalary(6969);
		assertEquals("Salary amount recieved",6969,e1.getSalary(),0);
		
	}
	
	@Test
	public void testsetName()
	{
		Name n = new Name("Mr"," Arthur", "Breton");
		e1.setName(n);
		assertEquals("Employee name,",n,e1.getName());
	}
	
	@Test
	public void testsetDateOfBirth() 
	{
		
		Date d = new Date(1,11,1999);
		e1.setDateOfBirth(d);
		assertEquals("Employee date of birth,",d,e1.getDateOfBirth());
	}
	
	@Test
	public void testStartDate() 
	{
		Date sd = new Date(1,11,2019);
		e1.setStartDate(sd);
		assertEquals("Employee start date,",sd,e1.getStartDate());
	}

}
