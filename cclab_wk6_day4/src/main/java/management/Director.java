package management;

public class Director extends Manager {

	private int budget;

	public Director(String name, String nationalInsuranceNumber, int salary, String deptName, int budget){
		super(name, nationalInsuranceNumber, salary, deptName);
		this.budget = budget;
	}

	public int getBudget(){
		return this.budget;
	}

}
