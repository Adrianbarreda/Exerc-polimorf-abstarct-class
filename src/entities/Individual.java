package entities;

public class Individual extends Taxpayers{
	
	private Double healthSpending;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxPaid() {
		if(annualIncome < 20000.00) {
			return (annualIncome * 0.15) - (healthSpending * 0.5);
		}
		else{
			return (annualIncome * 0.25) - (healthSpending * 0.5);
		}
	}
}
