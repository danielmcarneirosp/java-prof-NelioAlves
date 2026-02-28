package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percent) {
		double  increase = ( grossSalary * percent ) / 100;
		grossSalary += increase;
		return grossSalary;
	}
	
}
