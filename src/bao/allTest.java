package bao;

import static org.junit.Assert.*;

import org.junit.Test;

public class allTest {
	Calculate calculation = new Calculate();
	int sum = calculation.sum(2, 5);
	int testSum = 7;
	
	String testname = "zhoujiangfei";
	int testNameLength = testname.length();
	Assume lengthEqual = new Assume();
	boolean Assume = lengthEqual.Assume(testname,testNameLength);
	
	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
	
	@Test
	public void testnamelength() {
		System.out.println("testnamelength ≤‚ ‘¡À");
		assertEquals(Assume,true);
	}
	
	@Test
	public void testAssume() {
		System.out.println("testAssume ≤‚ ‘¡À");
		assertTrue(Assume);
	}
}