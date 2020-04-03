package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_BTest {

	@Test
	public void testGetMatch() {
		LRule j = new C_B();
		assertEquals('C', j.getMatch());
		assertNotEquals('B', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new C_B();
		char[] expectedResult = {'B'};
		char[] unexpectedResult = {'A'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertNotEquals(unexpectedResult[0], result[0]);
	}

}
