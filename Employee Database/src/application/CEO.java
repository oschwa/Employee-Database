package application;

public class CEO extends Employee{

	public CEO(String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email) 
	{
		super(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
	}
	
	// Weekly Pay Method for a CEO
	@Override
	public double calcWeeklySalary() {
		double weeklyPay = 0.0;
		
		if(getHours() > 80) {
			
			weeklyPay= (80 * getSalary()) + ((getHours() - 80) * 80);
			
		}
		
		else  if(getHours() >= 0 && getHours() <= 80)
		
		{
			weeklyPay = (getHours() * getSalary());
		}
		
		return weeklyPay;
	}

}
