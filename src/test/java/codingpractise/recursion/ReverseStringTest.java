package codingpractise.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString object;
	String inputString;

	@BeforeEach
	void setUp() throws Exception {
		object = new ReverseString();
		inputString = "Abhi";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReverseStringWhenInputIsEmpty() {
		String reverseString = object.reverseStringRecursion("");
		assertEquals("", reverseString, "String reverse failed.");
	}

	@Test
	void testReverseStringRecursion() {
		String reverseString = object.reverseStringIterative(inputString);
		assertEquals("ihbA", reverseString, "String reverse failed.");
	}

}
