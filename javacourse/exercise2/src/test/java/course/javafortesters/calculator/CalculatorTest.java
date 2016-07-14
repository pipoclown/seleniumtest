package course.javafortesters.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	@Ignore
	@Test(timeout = 500)
	public void testAdd() {
		Calculator tester = new Calculator();
		assertEquals("Result", 15, tester.add(10, 5));
	}

	@Test(timeout = 2000)
	public void testSubtract() {
		Calculator tester = new Calculator();
		assertEquals("Result", 5, tester.subtract(10, 5));
	}

	@Test
	public void testMultipy() {
		Calculator tester = new Calculator();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		Calculator tester = new Calculator();
		assertEquals("Result", 2, tester.divide(10, 0));
	}
}
