public class Guest {

	private String name;
	private int funds;

	public Guest(String name, int funds){
		this.name = name;
		this.funds = funds;
	}

	public String getName(){
		return this.name;
	}

	public int getFunds(){
		return this.funds;
	}

	public int pay(int amount){
		if (funds - amount >= 0){
			funds -= amount;
			return amount;
		}
		return 0;
	}
}
