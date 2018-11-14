public class Card {

	private SuitType suit;
	private NumberType number;

	public Card(SuitType suit, NumberType number){
		this.suit = suit;
		this.number = number;
	}

	public SuitType getSuit(){
		return this.suit;
	}

	public NumberType getNumber(){
		return this.number;
	}

	public boolean isStrongerThan(Card cardToCompareTo){

		if ( this.number.getValue() > cardToCompareTo.number.getValue()){
			return true;
		}
		else if ( this.number.getValue() == cardToCompareTo.number.getValue()) {
			return isStrongerSuit(cardToCompareTo);
		}
		else {
			return false;
		}

	}

	public boolean isStrongerSuit(Card card){

		if (this.suit.getValue() > card.suit.getValue()){
			return true;
		}
		else {
			return false;
		}
	}

}
