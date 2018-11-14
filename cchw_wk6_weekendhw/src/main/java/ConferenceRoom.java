public class ConferenceRoom extends Room {

	private String name;
	private int dailyRate;

	public ConferenceRoom(String name, int dailyRate, int capacity){
		super(capacity);
		this.name = name;
		this.dailyRate = dailyRate;
	}

	public String getName(){
		return this.name;
	}

	public int getRate(){
		return this.dailyRate;
	}

}
