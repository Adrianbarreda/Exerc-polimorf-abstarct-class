package entities;

public class Company extends Taxpayers{
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxPaid() {
		if(numberOfEmployees > 10) {
			return (annualIncome * 0.14);
		}
		else {
			return (annualIncome * 0.16);
		}
	}
}
