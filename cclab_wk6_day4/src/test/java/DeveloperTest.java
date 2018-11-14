import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
	Developer developerMike;
	@Before
	public void before(){
		developerMike = new Developer("Mike", "Not saying", 200);
	}

	@Test
	public void hasName(){
		assertEquals("Mike", developerMike.getName());
	}

	@Test
	public void hasNationalInsuranceNumber(){
		assertEquals("Not saying", developerMike.getNationalInsuranceNumber());
	}

	@Test
	public void hasSalary(){
		assertEquals(200, developerMike.getSalary());
	}

	@Test
	public void salaryRaised(){
		developerMike.raiseSalary(1.26);
		assertEquals(252, developerMike.getSalary());
	}

	@Test
	public void checkBonus(){
		developerMike.payBonus();
		assertEquals(2, developerMike.payBonus());
	}
}
