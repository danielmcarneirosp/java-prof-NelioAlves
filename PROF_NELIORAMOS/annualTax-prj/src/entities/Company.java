package entities;

public class Company extends TaxPayer {
    
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
        double taxPayer = 0;
        if ( numberOfEmployees <= 10) {
        	taxPayer = (super.getAnnualIncome() * 16 / 100);
        }else {
        	taxPayer = (super.getAnnualIncome() * 14 / 100);
        }
		return taxPayer;
	}

}
