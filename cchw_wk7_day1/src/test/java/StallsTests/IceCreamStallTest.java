package StallsTests;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

	IceCreamStall iceCreamStall;
	@Before
	public void before(){
		iceCreamStall = new IceCreamStall("Mike's Ices", "Mike");
	}

	@Test
	public void canGetName(){
		assertEquals("Mike's Ices", iceCreamStall.getName());
	}

	@Test
	public void canGetOwnerName(){
		assertEquals("Mike", iceCreamStall.getOwnerName());
	}
}
