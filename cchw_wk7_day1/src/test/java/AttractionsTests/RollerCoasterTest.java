package AttractionsTests;

import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollerCoasterTest {

	RollerCoaster nemesis;
	@Before
	public void before(){
		nemesis = new RollerCoaster("Nemesis");
	}

	@Test
	public void canGetName(){
		assertEquals("Nemesis", nemesis.getName());
	}

}