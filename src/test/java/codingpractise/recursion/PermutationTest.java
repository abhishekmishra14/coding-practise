package codingpractise.recursion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermutationTest {

	private Permutation object;
	String inputString;

	@BeforeEach
	void setUp() throws Exception {
		object = new Permutation();
		inputString = "ABC";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindPermutation() {
		object.findPermutation(inputString);
		// System.out.println(permutString);
	}

}
