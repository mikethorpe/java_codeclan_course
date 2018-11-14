import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class HotelTest {

	Hotel codeClanTowers;
	ConferenceRoom meetingRoom1;
	ConferenceRoom expensiveConferenceRoom;
	ArrayList<Room> rooms;
	Guest pat;
	Guest mike;
	Guest laura;

	@Before
	public void before(){
		pat = new Guest("Pat", 100);
		mike = new Guest("Mike", 100);
		laura = new Guest("Laura", 100);

		rooms = new ArrayList<>();
		meetingRoom1 = new ConferenceRoom("Meeting Room 1 ", 25, 2);
		rooms.add(meetingRoom1);
		expensiveConferenceRoom = new ConferenceRoom("ExpensiveRoom", 200, 2);
		rooms.add(expensiveConferenceRoom);

		codeClanTowers = new Hotel("CodeClanTowers", rooms);
	}

	@Test
	public void canGetName(){
		assertEquals("CodeClanTowers", codeClanTowers.getName());
	}

	@Test
	public void canGetAllRooms(){
		assertEquals(2, codeClanTowers.getAllRooms().size());
	}

	@Test
	public void canCheckInGuestWhenRoomNotFull(){
		boolean checkedIn = codeClanTowers.checkInGuest(pat, meetingRoom1);
		assertEquals(1, meetingRoom1.numberOfGuests());
		assertTrue(checkedIn);
		assertEquals(75, pat.getFunds());
	}

	@Test
	public void cannotCheckInGuestWhenRoomFull(){
		codeClanTowers.checkInGuest(pat, meetingRoom1);
		codeClanTowers.checkInGuest(mike, meetingRoom1);
		boolean checkedIn = codeClanTowers.checkInGuest(laura, meetingRoom1);
		assertEquals(2, meetingRoom1.numberOfGuests());
		assertFalse(checkedIn);
		assertEquals(100,laura.getFunds());
	}

	@Test
	public void cannotCheckInGuestToRoomWithInsufficientFunds(){
		boolean checkedIn = codeClanTowers.checkInGuest(pat, expensiveConferenceRoom);
		assertEquals(0, expensiveConferenceRoom.numberOfGuests());
		assertFalse(checkedIn);
		assertEquals(100, pat.getFunds());
	}

	@Test
	public void canCheckOutGuestWhenRoomNotEmpty(){
		codeClanTowers.checkInGuest(pat, meetingRoom1);
		boolean checkedOut = codeClanTowers.checkOutGuest(meetingRoom1);
		assertEquals(0, meetingRoom1.numberOfGuests());
		assertTrue(checkedOut);
	}

	@Test
	public void cannotCheckOutGuestWhenRoomEmpty(){
		boolean checkedOut = codeClanTowers.checkOutGuest(meetingRoom1);
		assertFalse(checkedOut);
	}

	@Test
	public void canGetGuestsInRoom(){
		codeClanTowers.checkInGuest(pat, meetingRoom1);
		codeClanTowers.checkInGuest(mike, meetingRoom1);
		ArrayList<Guest> guestsInMeetingRoom = codeClanTowers.getRoomGuests(meetingRoom1);
		assertEquals(2, guestsInMeetingRoom.size());
	}
}
