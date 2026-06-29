package javv;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void multiplicationTest() {

        int res = Calculator.calculate(10, 2);

        assertEquals(20, res);						
    }

    @Test
    public void concatTest() {

        Calculator c = new Calculator();

        String res = c.concat("Hello", " World");

        assertEquals("Hello World", res);
    }
    
//    Author - Anbu Kumar G
}