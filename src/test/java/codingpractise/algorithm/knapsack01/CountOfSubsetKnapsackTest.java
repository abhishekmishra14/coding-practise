package codingpractise.algorithm.knapsack01;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountOfSubsetKnapsackTest {

	CountOfSubsetKnapsack object;
	int sum;
	int inputArray[];

	@BeforeEach
	void setUp() throws Exception {
		object = new CountOfSubsetKnapsack();
		sum = 10;
		inputArray = new int[] { 3, 8, 2, 7, 1 };
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSubsetCountWhenSumZero() {
		int count = object.getSubsetCountForGivenSumRecurssion(inputArray, 0, inputArray.length);
		assertEquals(1, count, "Subset Count match failed.");
	}

	@Test
	public void testSubsetCountWhenArrayAndSumEmpty() {
		int count = object.getSubsetCountForGivenSumRecurssion(new int[] {}, 0, 0);
		assertEquals(1, count, "Subset Count match failed.");
	}

	@Test
	public void testGetSubsetCountForGivenSumMatchFound() {
		int count = object.getSubsetCountForGivenSumRecurssion(inputArray, sum, inputArray.length);
		assertNotEquals("Subset Count match failed.", 1, count);
	}

	@Test
	public void testGetSubsetCountForGivenSumMatchNotFound() {
		int count = object.getSubsetCountForGivenSumRecurssion(inputArray, sum, inputArray.length);
		assertEquals(3, count, "Subset Count match not failed.");
	}
}
