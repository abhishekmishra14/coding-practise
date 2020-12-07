package codingpractise.algorithm.knapsack01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SubsetSumKnapsackTest {

	SubsetSumKnapsack subsetSumKnapsack;
	int[] inputArray;
	int arraySize;

	@BeforeEach
	void setUp() throws Exception {
		subsetSumKnapsack = new SubsetSumKnapsack();
		inputArray = new int[] { 1, 9, 5, 7, 2 };
		arraySize = inputArray.length;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRecursionWhenThereIsSubsetForGivenSum() {
		int sum = 10;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursion(inputArray, sum, arraySize);
		Assert.assertTrue("There is subset for given sum:" + sum, isSubsetSum);
	}

	@Test
	void testRecursionWhenThereIsNoSubsetForGivenSum() {
		int sum = 4;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursion(inputArray, sum, arraySize);
		Assert.assertFalse("There is no subset for given sum:" + sum, isSubsetSum);
	}

	@Test
	void testRecursionMemoiazeWhenThereIsSubsetForGivenSum() {
		int sum = 10;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursionMemoize(inputArray, sum, arraySize);
		Assert.assertTrue("There is subset for given sum:" + sum, isSubsetSum);
	}

	@Test
	void testRecursionMemoiazeWhenThereIsNoSubsetForGivenSum() {
		int sum = 4;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursionMemoize(inputArray, sum, arraySize);
		Assert.assertFalse("There is no subset for given sum:" + sum, isSubsetSum);
	}

	@Test
	void testDPWhenThereIsSubsetForGivenSum() {
		int sum = 10;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursionMemoize(inputArray, sum, arraySize);
		Assert.assertTrue("There is subset for given sum:" + sum, isSubsetSum);
	}

	@Test
	void testDPWhenThereIsNoSubsetForGivenSum() {
		int sum = 4;
		boolean isSubsetSum = subsetSumKnapsack.findSubsetSumRecursionMemoize(inputArray, sum, arraySize);
		Assert.assertFalse("There is no subset for given sum:" + sum, isSubsetSum);
	}

}