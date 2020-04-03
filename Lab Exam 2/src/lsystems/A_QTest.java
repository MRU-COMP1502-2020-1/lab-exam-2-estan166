package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {

	@Test
	public void testGetMatch() {
		LRule j = new A_Q();
		assertEquals('A', j.getMatch());
		assertNotEquals('Q', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_Q();
		char[] expectedResult = {'Q'};
		char[] unexpectedResult = {'A'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertNotEquals(unexpectedResult[0], result[0]);
	}

}
