import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DataBaseAdminTest {
	DataBaseAdmin dataBaseAdminDiggy;
	@Before
	public void before(){
		dataBaseAdminDiggy = new DataBaseAdmin("Diggy", "What's an NI number", 300);
	}

	@Test
	public void hasName(){
		assertEquals("Diggy", dataBaseAdminDiggy.getName());
	}

	@Test
	public void hasNationalInsuranceNumber(){
		assertEquals("What's an NI number", dataBaseAdminDiggy.getNationalInsuranceNumber());
	}

	@Test
	public void hasSalary(){
		assertEquals(300, dataBaseAdminDiggy.getSalary());
	}

	@Test
	public void salaryRaised(){
		dataBaseAdminDiggy.raiseSalary(1.5);
		assertEquals(450, dataBaseAdminDiggy.getSalary());
	}

	@Test
	public void checkBonus(){
		dataBaseAdminDiggy.payBonus();
		assertEquals(3, dataBaseAdminDiggy.payBonus());
	}
}
