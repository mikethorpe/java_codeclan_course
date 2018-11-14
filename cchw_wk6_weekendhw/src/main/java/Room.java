import java.util.ArrayList;

public abstract class Room {

	private ArrayList<Guest> guests;
	private int capacity;

	public Room(int capacity){
		this.guests = new ArrayList<>();
		this.capacity = capacity;
	}

	public int numberOfGuests(){
		return this.guests.size();
	}

	public boolean addGuest(Guest guest){
		if (this.guests.size() < this.capacity) {
			this.guests.add(guest);
			return true;
		}
		return false;
	}

	public boolean removeGuest(){
		if (this.guests.size() > 0){
			this.guests.remove(0);
			return true;
		}
		return false;
	}

	public ArrayList<Guest> getGuests(){
		return this.guests;
	}

	public int getCapacity(){
		return this.capacity;
	}

	abstract int getRate();
}
