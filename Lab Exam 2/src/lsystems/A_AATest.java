package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {

	@Test
	public void testGetMatch() {
		LRule j = new A_AA();
		assertEquals('A', j.getMatch());
		assertNotEquals('B', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_AA();
		char[] expectedResult = {'A', 'A'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertEquals(expectedResult[1], result[1]);
	}

}
