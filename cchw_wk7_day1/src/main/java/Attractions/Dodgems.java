package Attractions;

import Visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed{

	private double price;

	public Dodgems(String name, double price){
		super(name);
		this.price = price;
	}

	public double defaultPrice(){
		return this.price;
	}

	// Children and OAPs pay half price - everyone else full price
	public double priceForVisitor(Visitor visitor){
		if (visitor.getAge() <= 16 || visitor.getAge() >=65){
			return  defaultPrice() / 2;
		}
		return this.price;
	}


}
