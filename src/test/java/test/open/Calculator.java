package test.open;

import org.junit.Assert;
import org.junit.Test;


public class Calculator {
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;  
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static  int multiply(int a, int b) {
		return a * b;
	}

	@Test
	public void testSum() {
	//Calculator calculator = new Calculator();
	Assert.assertEquals(4, sum(2, 2));
	}

	@Test
	public void testMinus() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(1, minus(2, 1));
	}

	@Test
	public void testDivide() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(2, divide(6, 3));
	}

/*    @Test
	public void testDivide {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, multiply(4, 2 ));
}*/
}