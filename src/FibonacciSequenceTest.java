import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence;

    @Before
    public void setUp() {
        fibonacciSequence = new FibonacciSequence();
    }

    @Test
    public void testFirstFibonacciNumberEquals0() {
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(0), 0);
    }

    private void assertFibonacciNumberAtGiverOrderEquals(BigInteger expected, int order) {
        assertEquals(expected, fibonacciSequence.numberAtOrder(order));
    }

    @Test
    public void testSecondAndThirdFibonacciNumberAllEquals1() {
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(1), 1);
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(1), 2);
    }

    @Test
    public void testFibonacciSequenceExpression() {
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(2), 3);
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(3), 4);
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(144), 12);
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(610), 15);
        assertFibonacciNumberAtGiverOrderEquals(BigInteger.valueOf(987), 16);
    }

    @Test
    public void testNumberOfDigitsForAGivenNumber() {
        assertEquals(1, fibonacciSequence.numberOfDigits(BigInteger.valueOf(0)));
        assertEquals(2, fibonacciSequence.numberOfDigits(BigInteger.valueOf(12)));
    }


    @Test
    public void testFirstFibonacciNumberWithNumberOfDigits() {
        assertEquals(BigInteger.valueOf(0), fibonacciSequence.firstNumberWith(1));
        assertEquals(BigInteger.valueOf(13), fibonacciSequence.firstNumberWith(2));
        assertEquals(BigInteger.valueOf(144), fibonacciSequence.firstNumberWith(3));
    }
}
