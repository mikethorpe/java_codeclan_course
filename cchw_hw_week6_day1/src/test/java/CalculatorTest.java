import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(3, calc.add(2,1));
   }

   @Test
    public void subtractNumbers(){
       assertEquals(3, calc.subtract(4,1));
   }

    @Test
    public void multipyNumbers(){
        assertEquals(6, calc.multiply(3,2));
    }

    @Test
    public void divideNumbers(){
        assertEquals(3, calc.divide(15,5));
    }

}
