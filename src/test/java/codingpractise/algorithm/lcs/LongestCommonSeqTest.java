package codingpractise.algorithm.lcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonSeqTest {

	private LongestCommonSeq object;

	@BeforeEach
	void setUp() throws Exception {
		object = new LongestCommonSeq();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetLCSWhenInputStringIsEmpty() {
		int length = object.getLCS("", "");
		assertEquals(0, length);
	}

	@Test
	void testGetLCSWhenInputStringIsNull() {
		int length = object.getLCS(null, "ABHISHEK");
		assertEquals(0, length);
	}

	@Test
	void testGetLCSWhenInputStringIsValid() {
		int length = object.getLCS("ABPK", "ABHISHEK");
		assertEquals(3, length);
	}

	@Test
	void testGetLCSMemoizeWhenInputStringIsValid() {
		int length = object.getLCSTabulation("ABPK", "ABHISHEK");
		assertEquals(3, length);
	}
	
	@Test
	void testprintLCS() {
		String lcs = object.printLCS("ABPK", "ABHISHEK");
		System.out.println(lcs);
	}
}
