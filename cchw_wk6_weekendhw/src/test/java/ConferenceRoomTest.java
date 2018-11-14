import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ConferenceRoomTest {

	ConferenceRoom meetingRoom1;
	Guest ally;
	@Before
	public void before(){
		ally = new Guest("Ally",100);
		meetingRoom1 = new ConferenceRoom("Meeting Room 1", 20, 2);
	}

	@Test
	public void canGetConferenceRoomName(){
		assertEquals("Meeting Room 1", meetingRoom1.getName());
	}

	@Test
	public void canGetConferenceRoomRate(){
		assertEquals(20, meetingRoom1.getRate());
	}

	@Test
	public void canGetNumberOfGuests(){
		assertEquals(0, meetingRoom1.numberOfGuests());
	}

	@Test
	public void canGetGuestsInRoom(){
		meetingRoom1.addGuest(ally);
		ArrayList<Guest> meetingRoom1Guests =  meetingRoom1.getGuests();
		assertEquals(1, meetingRoom1Guests.size());
	}

	@Test
	public void canAddGuestToConferenceRoomWhenNotFull(){
		boolean addedGuest = meetingRoom1.addGuest(ally);
		assertEquals(1, meetingRoom1.numberOfGuests());
		assertTrue(addedGuest);
	}

	@Test
	public void cannotAddGuestToConferenceRoomWhenFull(){
		meetingRoom1.addGuest(ally);
		meetingRoom1.addGuest(ally);
		boolean addedGuest = meetingRoom1.addGuest(ally);
		assertEquals(2, meetingRoom1.numberOfGuests());
		assertFalse(addedGuest);
	}

	@Test
	public void canRemoveGuestIfConferenceRoomNotEmpty(){
		meetingRoom1.addGuest(ally);
		boolean removedGuest = meetingRoom1.removeGuest();
		assertEquals(0, meetingRoom1.numberOfGuests());
		assertTrue(removedGuest);
	}

	@Test
	public void cannotRemoveGuestIfConferenceRoomEmpty(){
		boolean removedGuest = meetingRoom1.removeGuest();
		assertFalse(removedGuest);
	}

	@Test
	public void canGetCapacity(){
		assertEquals(2, meetingRoom1.getCapacity());
	}

}
