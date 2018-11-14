import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
    }

    @Test
    public void successfulPrint(){
        printer = new Printer(20, 50);
        printer.print(3,2);
        assertEquals(14, printer.getSheetsLeft());
    }

    @Test
    public void outOfPaper(){
        printer = new Printer(20, 50);
        printer.print(10,3);
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void printerRefilled(){
        printer = new Printer(20, 50);
        printer.refillPaper();
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void tonerReducedAfterPrint(){
        printer = new Printer(20, 50);
        printer.print(3,2);
        assertEquals(44, printer.getTonerVolume());
    }
}
