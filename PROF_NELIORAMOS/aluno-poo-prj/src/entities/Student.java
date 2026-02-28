package entities;

public class Student {
	
	public String name;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double calculaNote() {
		return tri1 + tri2 + tri3;
	}
	
	public String status(double value) {
		return (value >= 60) ? "PASS" : "FAILED";
	}
	
	public double missingGrade(double value) {
		return 60 - value;
	}

}
