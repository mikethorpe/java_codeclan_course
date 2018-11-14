import java.util.ArrayList;

public class Hotel {

	private String name;
	private ArrayList<Room> rooms;

	public Hotel(String name, ArrayList<Room> rooms){
		this.name = name;
		this.rooms = rooms;
	}

	public String getName(){
		return this.name;
	}

	public ArrayList<Room> getAllRooms(){
		return this.rooms;
	}

	public boolean checkInGuest(Guest guest, Room room){

		boolean canCheckIn = false;

		if (guest.getFunds() > room.getRate()) {
			canCheckIn = room.addGuest(guest);
		}

		if (canCheckIn == true){
			guest.pay(room.getRate());
		}

		return canCheckIn;
	}

	public boolean checkOutGuest(Room room){
		return room.removeGuest();
	}

	public ArrayList<Guest> getRoomGuests(Room room){
		return room.getGuests();
	}


}
