package pkgInt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger Integer1 = new MyInteger(10);
		MyInteger Integer2 = new MyInteger(7);
		
		assertTrue(Integer1.isEven());
		assertFalse(Integer1.isOdd());
		assertFalse(Integer1.isPrime());
		assertTrue(MyInteger.isEven(10));
		assertFalse(MyInteger.isOdd(10));
		assertFalse(MyInteger.isPrime(10));
		assertTrue(MyInteger.isEven(Integer1));
		assertFalse(MyInteger.isOdd(Integer1));
		assertFalse(MyInteger.isPrime(Integer1));
		assertTrue(Integer1.equals(10));
		assertFalse(Integer1.equals(9));
		assertTrue(Integer1.equals(Integer1));
		assertFalse(Integer1.equals(Integer2));
		
		assertFalse(Integer2.isEven());
		assertTrue(Integer2.isOdd());
		assertTrue(Integer2.isPrime());
		assertTrue(Integer2.equals(7));
		assertFalse(Integer2.equals(6));
		assertTrue(Integer2.equals(Integer2));
		assertFalse(Integer2.equals(Integer1));
		
		
	}

}
