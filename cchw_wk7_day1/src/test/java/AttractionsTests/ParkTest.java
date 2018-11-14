package AttractionsTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

	Park centralPark;
	@Before
	public void before(){
		centralPark= new Park("Central Park");
	}

	@Test
	public void canGetName(){
		assertEquals("Central Park", centralPark.getName());
	}

}