
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee (String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Update to ensure monthSalaray is either 0.0 or positive
	if (monthlySalary < 0.0) {
		this.monthlySalary = 0.0;
	} else {
		this.monthlySalary = monthlySalary;
		}
	}
	
	public String getfirstName() {
		return firstName;
		
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public double getmonthlySalary() {
		return monthlySalary;
	}
	
	public double getyearlySalary() {
		return monthlySalary * 12;
		
	}
	
}
