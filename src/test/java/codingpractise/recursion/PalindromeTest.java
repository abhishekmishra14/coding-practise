package codingpractise.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome object;
	String inputString;

	@BeforeEach
	void setUp() throws Exception {
		object = new Palindrome();
		inputString = "amma";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsPalindrome() {
		boolean isPalindrome = object.isPalindromeDoublePointer(inputString);
		assertTrue(isPalindrome, "PAlindrome check failed.");
	}

}
