public class BedRoom extends Room {

	private int roomNumber;
	private int nightlyRate;
	private BedRoomType type;

	public BedRoom(int roomNumber, int nightlyRate, BedRoomType type){
		super(type.getCapacity());
		this.roomNumber = roomNumber;
		this.nightlyRate = nightlyRate;
		this.type = type;
	}

	public int getBedroomNumber(){
		return this.roomNumber;
	}

	public int getRate(){
		return this.nightlyRate;
	}

	public BedRoomType getType(){
		return this.type;
	}

}
