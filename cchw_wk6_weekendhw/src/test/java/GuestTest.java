import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class GuestTest {

	Guest pawel;
	@Before
	public void before(){
		pawel = new Guest("Pawel", 100);
	}

	@Test
	public void guestHasName(){
		assertEquals("Pawel", pawel.getName());
	}

	@Test
	public void canGetFunds(){
		assertEquals(100, pawel.getFunds());
	}

	@Test
	public void canPayIfFundsAvailable(){
		int amountPaid = pawel.pay(50);
		assertEquals(50, pawel.getFunds());
		assertEquals(50, amountPaid);
	}

	@Test
	public void cannotPayIfFundsNotAvailable(){
		int amountPaid = pawel.pay(101);
		assertEquals(100, pawel.getFunds());
		assertEquals(0, amountPaid);
	}
}
