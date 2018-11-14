public enum BedRoomType {
	Single(1),
	Double(2);


	private int capacity;

	BedRoomType(int capacity){
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

}
