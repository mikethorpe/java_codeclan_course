package Attractions;

import Visitors.Visitor;

public interface ITicketed {
	double defaultPrice();
	double priceForVisitor(Visitor visitor);
}
