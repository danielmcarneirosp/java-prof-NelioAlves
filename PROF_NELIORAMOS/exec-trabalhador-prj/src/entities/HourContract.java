package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer Hour;
	
	public HourContract() {}

	public HourContract(Date date, Double valuePerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.Hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return Hour;
	}

	public void setHour(Integer hour) {
		Hour = hour;
	}
	
	
	public Double totalValue() {
		return Hour * valuePerHour;
	}

}
