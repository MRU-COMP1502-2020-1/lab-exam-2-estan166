package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_XTest {

	@Test
	public void testGetMatch() {
		LRule j = new A_X();
		assertEquals('A', j.getMatch());
		assertNotEquals('B', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_X();
		char[] expectedResult = new char[0];
		assertEquals(expectedResult.length, j.getBody().length);
	}

}
