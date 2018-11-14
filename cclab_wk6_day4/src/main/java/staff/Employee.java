package staff;

public class Employee {

	private String name;
	private String nationalInsuranceNumber;
	private int salary;

	public Employee(String name, String nationalInsuranceNumber, int salary){
		this.name = name;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
		this.salary = salary;
	}

	public String getName(){
		return this.name;
	}

	public String getNationalInsuranceNumber(){
		return this.nationalInsuranceNumber;
	}

	public int getSalary(){
		return this.salary;
	}

	public void raiseSalary(double raiseFactor){
		double newSalary = raiseFactor * salary;
		this.salary = (int)newSalary;
	}

	public int payBonus(){
		double bonus = salary * 0.01;
		return (int)bonus;
	}
}
