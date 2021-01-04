package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalculatorTest {
    MyCalculator calculator = new MyCalculator();

    @Test
    public void plus() {
        assertEquals(2, calculator.plus(1, 1));
    }

    @Test
    public void minus() {
        assertEquals(0, calculator.minus(1, 1));
    }

    @Test
    public void multi() {
        assertEquals(0, calculator.multi(1, 1));
    }

    @Test
    public void divide() {
        assertEquals(1, calculator.divide(1, 1));
    }
}