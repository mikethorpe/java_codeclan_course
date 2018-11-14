package AttractionsTests;

import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

	Dodgems davesDodgems;
	@Before
	public void before(){
		davesDodgems = new Dodgems("Dave's Dodgems", 10.0);

	}

	@Test
	public void canGetName(){
		assertEquals("Dave's Dodgems", davesDodgems.getName());
	}


	@Test
	public void canGetDefaultPrice(){
		assertEquals(10, davesDodgems.defaultPrice(), 0);
	}

	@Test
	public void canGetPriceForOapVisitor(){
		Visitor oap = new Visitor("Greg", 65, 180, 200);;
		assertEquals(5, davesDodgems.priceForVisitor(oap), 0);
	}

	@Test
	public void canGetPriceForRegularVisitor(){
		Visitor regularVisitor = new Visitor("Greg", 20, 180, 200);;
		assertEquals(10, davesDodgems.priceForVisitor(regularVisitor), 0);
	}

	@Test
	public void canGetPriceForChildVisitor(){
		Visitor childVisitor = new Visitor("Greg", 16, 100, 200);;
		assertEquals(5, davesDodgems.priceForVisitor(childVisitor), 0);
	}
}
