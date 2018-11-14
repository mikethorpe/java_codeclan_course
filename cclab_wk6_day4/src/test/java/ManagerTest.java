import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

	Manager managerMarcin;
	@Before
	public void before(){
		managerMarcin = new Manager("Marcin", "SG 00 00 00 A", 100, "HR");
	}

	@Test
	public void hasName(){
		assertEquals("Marcin",managerMarcin.getName());
	}

	@Test
	public void hasNationalInsuranceNumber(){
		assertEquals("SG 00 00 00 A", managerMarcin.getNationalInsuranceNumber());
	}

	@Test
	public void hasSalary(){
		assertEquals(100, managerMarcin.getSalary());
	}

	@Test
	public void hasDept(){
		assertEquals("HR", managerMarcin.getDeptName());
	}

	@Test
	public void salaryRaised(){
		managerMarcin.raiseSalary(1.25);
		assertEquals(125, managerMarcin.getSalary());
	}

	@Test
	public void checkBonus(){
		managerMarcin.payBonus();
		assertEquals(1, managerMarcin.payBonus());
	}
}
