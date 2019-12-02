package ie.lyit.bank;



public class Employee extends Person {
	private Date startDate;
	private double salary;
	private int empNumber;
	
	private static int nextNumber=1;
	private final double max_salary = 150000;
	
	public Employee() {
		super();
		startDate = new Date();
		salary = 0;
		empNumber = nextNumber++;
	}
	
	public Employee(Name name,Date dob,Date sd,double sal) {
		super(name,dob);
		startDate = sd;
		salary = sal;
		empNumber = nextNumber++;
	}
	
	
	@Override
	public String toString() {
		return (super.toString()+",Employee Number: "+empNumber+",Start Date: "+startDate
				+",Salary: "+salary);
	}
	
	
	
	public double calculateWage(double taxPercentage)

	{
		return (this.salary /12) - ((this.salary /12)) * (taxPercentage /100); //calculates the total wage received after being Taxed
	}
	

	public void incrementSalary(double incrementAmount) {
		
		
		if(salary + incrementAmount > max_salary)
			throw new IllegalArgumentException(" Increment Amount and salary is more than the Maximum ammount ");
		else
			salary += incrementAmount;
	} // this makes sure total salary + increment Amount is not more then the max Salary limit of 150000 
	
	
	public void setStartDate(Date startDateIn) {
		startDate = startDateIn;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setSalary(double salaryIn) {
		salary = salaryIn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}

}

