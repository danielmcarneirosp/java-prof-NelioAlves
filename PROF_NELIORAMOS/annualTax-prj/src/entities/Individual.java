package entities;

public class Individual extends TaxPayer {

	private Double healtExpenditures;
	
	
	public Individual() {
		
	}
	
	public Individual(String name, Double annualIncome, Double healtExpenditures) {
		super(name, annualIncome);
		this.healtExpenditures = healtExpenditures;
	}

	
	public Double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(Double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}


	@Override
	public Double tax() {
		double taxPayer = 0;
        if (super.getAnnualIncome() < 20000.0) {
        	taxPayer = (( super.getAnnualIncome() * 15 / 100) - (healtExpenditures * 50 /100));
        }else {
        	taxPayer = (( super.getAnnualIncome() * 25 / 100) - (healtExpenditures * 50 /100));
        }
		return taxPayer;
	}

}
