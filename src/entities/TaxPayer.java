package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double realthSpending;
	private double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double realthSpending,
			double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.realthSpending = realthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getRealthSpending() {
		return realthSpending;
	}

	public void setRealthSpending(double realthSpending) {
		this.realthSpending = realthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	

	public double salaryTax(double salary) {
		double salaryMes = salary/12;
		double indiceImposto = 0;
		if (salaryMes <= 3000.00) {
			return indiceImposto = 0;

		} else if (salaryMes > 3000.0 && salaryMes <= 5000.0) {
			return indiceImposto = 10;

		} else {
			return indiceImposto = 20;
		}

	}

	public double servicesTax(double services) {

		return services = services * 15 / 100;

	}

	public double capitalTax(double capitalTax) {

		return capitalTax = capitalTax * 20 / 100;

	}

	public double grossTax() {
		
		 return  (getSalaryIncome() * salaryTax(salaryIncome) /100 + capitalTax(capitalIncome) + servicesTax(servicesIncome));
		}

	public double taxRebate() {
	   double totalAbatimento = getEducationSpending() + getRealthSpending();
	   double salaryMes = grossTax() / 12;
	   	   if (grossTax() > totalAbatimento) {
	   		   return totalAbatimento;
	   	   }else {
	   		return grossTax() * 30/100;
	 	      
	   	   }
	   
	   		
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return "salaryIncome=" 
	+ salaryIncome 
	+ ", servicesIncome=" 
	+ servicesIncome 
	+ ", capitalIncome="
	+ capitalIncome 
	+ ", realthSpending=" 
	+ realthSpending 
	+ ", educationSpending=" 
	+ educationSpending;
				
	}

}
