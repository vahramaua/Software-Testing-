import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {




        @Test
        void testAdd() {
            SimpleCalculator calc = new SimpleCalculator();
            assertEquals(5, calc.add(2, 3));
            assertEquals(2, calc.add(2, 0));
            assertEquals(3, calc.add(0, 3));
            assertEquals(0, calc.add(0, 0));
        }

        @Test
        void testSubtract() {
            SimpleCalculator calc = new SimpleCalculator();
            assertEquals(-1, calc.subtract(2, 3));
            assertEquals(2, calc.subtract(2, 0));
            assertEquals(3, calc.subtract(0, -3));
            assertEquals(0, calc.subtract(0, 0));
        }

        @Test
        void testMultiply() {
            SimpleCalculator calc = new SimpleCalculator();
            assertEquals(6, calc.multiply(2, 3));
            assertEquals(0, calc.multiply(2, 0));
            assertEquals(0, calc.multiply(0, -3));
            assertEquals(0, calc.multiply(0, 0));
        }

        @Test
        void testDivide() {
            SimpleCalculator calc = new SimpleCalculator();
            assertEquals(2, calc.divide(6, 3));
            assertThrows(IllegalArgumentException.class, () -> calc.divide(6, 0));
        }

        @Test
        void testPower() {
            SimpleCalculator calc = new SimpleCalculator();
            assertEquals(8, calc.power(2, 3));
            assertEquals(1, calc.power(2, 0));
            assertEquals(2, calc.power(2, 1));
        }
    }

