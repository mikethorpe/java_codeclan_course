package Stalls;

public class Stall {

	private String name;
	private String ownerName;

	public Stall(String name, String ownerName){
		this.name = name;
		this.ownerName = ownerName;
	}

	public String getName(){
		return this.name;
	}

	public String getOwnerName(){
		return this.ownerName;
	}
}
