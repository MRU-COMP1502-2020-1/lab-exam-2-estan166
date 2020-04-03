package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {

	@Test
	public void testGetMatch() {
		LRule j = new A_BC();
		assertEquals('A', j.getMatch());
		assertNotEquals('B', j.getMatch());
	}
	
	@Test
	public void testGetBody() {
		LRule j = new A_BC();
		char[] expectedResult = {'B', 'C'};
		char[] result = j.getBody();
		assertEquals(expectedResult[0], result[0]);
		assertEquals(expectedResult[1], result[1]);
	}

}
