import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

	Director directorRiccardo;
	@Before
	public void before(){
		directorRiccardo = new Director("Riccardo", "People deal with this for me", 400, "The company", 1000);
	}

	@Test
	public void hasName(){
		assertEquals("Riccardo", directorRiccardo.getName());
	}

	@Test
	public void hasNationalInsuranceNumber(){
		assertEquals("People deal with this for me", directorRiccardo.getNationalInsuranceNumber());
	}

	@Test
	public void hasSalary(){
		assertEquals(400, directorRiccardo.getSalary());
	}

	@Test
	public void hasDept(){
		assertEquals("The company", directorRiccardo.getDeptName());
	}

	@Test
	public void salaryRaised(){
		directorRiccardo.raiseSalary(1.25);
		assertEquals(500, directorRiccardo.getSalary());
	}

	@Test
	public void checkBonus(){
		directorRiccardo.payBonus();
		assertEquals(4, directorRiccardo.payBonus());
	}
}
