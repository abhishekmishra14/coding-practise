package codingpractise.algorithm.knapsack01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualSumPartitionKnapsackTest {

	private EqualSumPartitionKnapsack object;
	int inputArray[];

	@BeforeEach
	void setUp() throws Exception {
		object = new EqualSumPartitionKnapsack();
		// inputArray = new int[] { 2, 8, 5, 7, 4 };
		inputArray = new int[] { 9, 4, 1, 6 };
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindEqualSumPartitionWhenArrayIsNull() {
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			object.findEqualSumPartitionSubset(null, 10);
		});
		assertTrue("Input invalid.".equals(ex.getMessage()));
	}

	@Test
	void testFindEqualSumPartitionWhenArrayAndSumIsEmpty() {
		boolean isEqualPartition = object.findEqualSumPartitionSubset(new int[] {}, 0);
		assertTrue(isEqualPartition, "Equal partition valid when array is empty.");
	}

	@Test
	void testFindEqualSumPartitionWhenSumIsZero() {
		boolean isEqualPartition = object.findEqualSumPartitionSubset(inputArray, 0);
		assertTrue(isEqualPartition, "Sum 0 is  valid.");
	}

	@Test
	void testFindEqualSumPartitionMatchNotFound() {
		boolean isEqualPartition = object.findEqualSumPartitionSubset(new int[] { 3, 8, 5, 7 }, 10);
		assertFalse(isEqualPartition, "Partition not possible as summation is not even");
	}

	@Test
	void testFindEqualSumPartitionMatchFound() {
		boolean isEqualPartition = object.findEqualSumPartitionSubset(inputArray, 10);
		assertTrue(isEqualPartition, "Partition Found");
	}
}
