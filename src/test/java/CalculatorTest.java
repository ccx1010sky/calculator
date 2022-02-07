import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){ calculator = new Calculator(10,5);};

    @Test
    public void testAdd() {
        assertEquals(15, calculator.add());
    }
    @Test
    public void testSub(){
        assertEquals(5,calculator.sub());
    }
    @Test
    public void testMulti(){
        assertEquals(50,calculator.multi());
    }
    @Test
//    Calculator cal1 = new Calculator(9.0,2.0);
    public void  testDivide(){
        assertEquals(2.0,calculator.divide(),0.0);
    }





}
