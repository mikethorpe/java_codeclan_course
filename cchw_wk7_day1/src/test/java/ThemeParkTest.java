import Attractions.Dodgems;
import Stalls.IceCreamStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

	ThemePark thorpePark;
	Dodgems davesDodgems;
	Visitor stuart;
	IceCreamStall iceCreamStall;

	@Before
	public void before(){
		thorpePark = new ThemePark("Thorpe Park");
		davesDodgems = new Dodgems("Dave's Dodgems", 5.20);
		iceCreamStall = new IceCreamStall("Mike's Ices", "Mike");
		stuart = new Visitor("Stuart", 89, 180, 50);
	}

	@Test
	public void canGetName(){
		assertEquals("Thorpe Park", thorpePark.getName());
	}

	@Test
	public void canVisitAttraction(){
		assertEquals("Stuart visited Dave's Dodgems", thorpePark.visit(stuart, davesDodgems));
	}

	@Test
	public void canAddAttraction(){
		thorpePark.addAttraction(davesDodgems);
		assertEquals(1, thorpePark.numberOfAttractions());
	}

	@Test
	public void canAddStall(){
		thorpePark.addStall(iceCreamStall);
		assertEquals(1, thorpePark.numberOfStalls());
	}
}
