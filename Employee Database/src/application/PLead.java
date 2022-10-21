package application;

public class PLead extends Employee{

	public PLead(String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email) 
	{
		super(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
	}
	
	// Weekly Pay Method for a Project Lead
	@Override
	public double calcWeeklySalary() {
		
		double weeklyPay = 0.0;
		
		if(getHours() > 50) {
			
			weeklyPay= (50 * getSalary()) + ((getHours() - 50) * 70);
			
		}
		
		else  if(getHours() >= 0 && getHours() <= 50)
		
		{
			weeklyPay = (getHours() * getSalary());
		}
		
		return weeklyPay;
	}

}
