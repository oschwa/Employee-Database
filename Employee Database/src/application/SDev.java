package application;

public class SDev extends Employee{

	public SDev(String firstName, String lastName, char middleInitial, String dob, String id, double salary, String empTask, int hours, String email)
	{
		super(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
	}
	
	// Weekly Pay Method for a Senior Developer
	@Override
	public double calcWeeklySalary() {
		
		double weeklyPay = 0.0;
		
		if(getHours() > 60) {
			
			weeklyPay= (60 * getSalary()) + ((getHours() - 60) * 60);
			
		}
		
		else  if(getHours() >= 0 && getHours() <= 60)
		
		{
			weeklyPay = (getHours() * getSalary());
		}
		
		return weeklyPay;
	}
	
}
