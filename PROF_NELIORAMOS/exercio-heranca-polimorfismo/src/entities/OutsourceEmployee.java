package entities;

import java.lang.foreign.PaddingLayout;

public class OutsourceEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, double valuePerHour, Double additionlCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionlCharge;
	}

	public Double getAdditionlCharge() {
		return additionalCharge;
	}

	public void setAdditionlCharge(Double additionlCharge) {
		this.additionalCharge = additionlCharge;
	}
	
	@Override
	public Double payment() {
		double acrescimo = additionalCharge * 110 / 100; 
		double valuePayment = super.payment() + acrescimo;
		return valuePayment;
	}

}
