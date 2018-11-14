import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class BedRoomTest {

	BedRoom pentHouse;
	Guest vickyJackson;
	@Before
	public void before(){
		pentHouse = new BedRoom(1, 100, BedRoomType.Double);
		vickyJackson = new Guest("Vicky Jackson", 100);
	}

	@Test
	public void canGetRoomNumber(){
		assertEquals(1, pentHouse.getBedroomNumber());
	}

	@Test
	public void canGetRoomRate(){
		assertEquals(100, pentHouse.getRate());
	}

	@Test
	public void canGetBedRoomType(){
		assertEquals(BedRoomType.Double, pentHouse.getType());
	}

	@Test
	public void canGetBedRoomCapacity(){
		assertEquals(2, pentHouse.getCapacity());
	}

	@Test
	public void canGetNumberOfGuests(){
		assertEquals(0, pentHouse.numberOfGuests());
	}

	@Test
	public void canAddGuestToBedRoomWhenNotFull(){
		boolean addedGuest = pentHouse.addGuest(vickyJackson);
		assertEquals(1, pentHouse.numberOfGuests());
		assertTrue(addedGuest);
	}

	@Test
	public void cannotAddGuestToBedRoomWhenFull(){
		pentHouse.addGuest(vickyJackson);
		pentHouse.addGuest(vickyJackson);
		boolean addedGuest = pentHouse.addGuest(vickyJackson);
		assertEquals(2, pentHouse.numberOfGuests());
		assertFalse(addedGuest);

	}

	@Test
	public void canRemoveGuestIfRoomNotEmpty(){
		pentHouse.addGuest(vickyJackson);
		boolean removedGuest = pentHouse.removeGuest();
		assertEquals(0, pentHouse.numberOfGuests());
		assertTrue(removedGuest);
	}

	@Test
	public void cannotRemoveGuest(){
		boolean removedGuest = pentHouse.removeGuest();
		assertFalse(removedGuest);
	}

	@Test
	public void canGetGuestsInRoom(){
		pentHouse.addGuest(vickyJackson);
		ArrayList<Guest> meetingRoom1Guests =  pentHouse.getGuests();
		assertEquals(1, meetingRoom1Guests.size());
	}
}
