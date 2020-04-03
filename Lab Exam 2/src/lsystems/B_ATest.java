package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ATest {

	@Test
	public void testGetMatch() {
		LRule j = new B_A();
		assertEquals('B', j.getMatch());
		assertNotEquals('A', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_A();
		char[] expectedResult = {'A'};
		char[] unexpectedResult = {'B'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertNotEquals(unexpectedResult[0], result[0]);
	}

}
