package application;

public class JDev extends Employee{

	public JDev(String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email) 
	{
		super(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
	}
	
	// Weekly Pay Method for a Junior Developer
	@Override
	public double calcWeeklySalary() {
		
		double weeklyPay = 0.0;
		
		if(getHours() > 50) {
			
			weeklyPay= (50 * getSalary()) + ((getHours() - 50) * 40);
			
		}
		
		else  if(getHours() >= 0 && getHours() <= 50)
		
		{
			weeklyPay = (getHours() * getSalary());
		}
		
		return weeklyPay;
	}

}
