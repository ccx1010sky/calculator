import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){ calculator = new Calculator(3,5);};

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add());
    }
    @Test
    public void testSub(){
        assertEquals(-2,calculator.sub());
    }





}
