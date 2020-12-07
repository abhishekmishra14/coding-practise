package codingpractise.algorithm.lcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonSubStringTest {

	private LongestCommonSubString object;

	@BeforeEach
	void setUp() throws Exception {
		object = new LongestCommonSubString();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetLCSS() {
		int length = object.getLCSS("zxabcdez", "yzabcdez");
		assertEquals(6, length);
	}
	
	@Test
	void testGetLCSSMemoize() {
		int length = object.getLCSSMemoiaze("zxabcdez", "yzabcdez");
		assertEquals(6, length);
	}
	
	@Test
	void testGetLCSSTabulation() {
		int length = object.getLCSSTabulation("zxabcdez", "yzabcdez");
		assertEquals(6, length);
	}
	
	@Test
	void testGetLCSS1() {
		String lcss = object.printLCSS("zxabcdez", "yzabcdez");
		assertEquals("abcdez", lcss);
	}

}
