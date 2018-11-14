package AttractionsTests;

import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

	Playground playground;
	@Before
	public void before(){
		playground = new Playground("Perfect play");
	}

	@Test
	public void canGetName(){
		assertEquals("Perfect play", playground.getName());
	}

}