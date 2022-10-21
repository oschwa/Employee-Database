package application;

public class Intern extends Employee{

	public Intern(String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email) 
	{
		super(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
	}
	
	// Lmao interns dont get paid 
	@Override
	public double calcWeeklySalary() {
		return 0;
	}
	
}
