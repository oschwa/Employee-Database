package application;

public abstract class Employee {
	
	// Employee Fields
	
	private String firstName = "";
	private String lastName = "";
	private char middleInitial;
	private String dob = "";
	private String id = "";
	private double salary = 0.0;
	private String empTask = "";
	private int hours = 0;
	private String email = "";
	
	// Employee Constructor that will store all of the necessary information of an employee, this will help create employee objects that can be added
	// to hashmaps in the database class later down the line
	public Employee (String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email) 
	{	
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.dob = dob;
		this.id = id;
		this.salary = salary;
		this.empTask = empTask;
		this.hours = hours;
		this.email = email;
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpTask() {
		return empTask;
	}

	public void setEmpTask(String empTask) {
		this.empTask = empTask;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printInfo() {
		System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.");
		System.out.println();
		System.out.println("Employee Name: " + getFirstName() + " " + getMiddleInitial() + ". " + getLastName());
		System.out.println("ID: " + getId() + "                      DOB: " + getDob());
		System.out.println("Base Hourly Salary: " + getSalary() + "  Weekly Hours: " + getHours());
		System.out.println("Employee Task: " + getEmpTask());
		System.out.println("Employee Email: " + getEmail());
	}
	
	public abstract double calcWeeklySalary();
	
}
