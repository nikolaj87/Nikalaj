package practice.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    public void testsum(){
        assertEquals(11, Calc.sum(4,7));
    }
    @Test
    public void testmin(){
        assertEquals(4, Calc.min(7,3));
    }

}