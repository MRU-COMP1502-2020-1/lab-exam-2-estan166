package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ATest {

	@Test
	public void testGetMatch() {
		LRule j = new A_A();
		assertEquals('A', j.getMatch());
		assertNotEquals('B', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_A();
		char[] expectedResult = {'A'};
		char[] unexpectedResult = {'C'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertNotEquals(unexpectedResult[0], result[0]);
	}

}
