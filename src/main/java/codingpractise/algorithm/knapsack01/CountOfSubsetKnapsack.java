package codingpractise.algorithm.knapsack01;

import java.util.Arrays;

public class CountOfSubsetKnapsack {

	public int getSubsetCountForGivenSum(int[] inputArray, int sum) {
		int count = 0;
		if (inputArray == null) {
			throw new IllegalArgumentException("Input array is null.");
		}
		if (sum == 0 || inputArray.length == 0) {
			return count;
		}

		int n = inputArray.length;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (sum == inputArray[i] + inputArray[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public int getSubsetCountForGivenSumDoublePointer(int[] inputArray, int sum) {
		int count = 0;
		if (inputArray == null) {
			throw new IllegalArgumentException("Input array is null.");
		}
		if (sum == 0 || inputArray.length == 0) {
			return count;
		}
		Arrays.sort(inputArray);
		int startIndex = 0;
		int endIndex = inputArray.length - 1;

		while (startIndex < endIndex) {
			if (inputArray[startIndex] + inputArray[endIndex] == sum) {
				count++;
				startIndex++;
			} else if (inputArray[startIndex] + inputArray[endIndex] < sum) {
				startIndex++;
			} else {
				endIndex--;
			}
		}
		return count;
	}

	public int getSubsetCountForGivenSumRecurssion(int[] inputArray, int sum, int n) {
		if (inputArray == null) {
			throw new IllegalArgumentException("Input array is null.");
		}

		if (n == 0) {
			if (sum == 0) {
				return 1;
			} else {
				return 0;
			}

		}

		if (inputArray[n - 1] <= sum) {
			return getSubsetCountForGivenSumRecurssion(inputArray, sum - inputArray[n - 1], n - 1)
					+ getSubsetCountForGivenSumRecurssion(inputArray, sum, n - 1);
		} else {
			return getSubsetCountForGivenSumRecurssion(inputArray, sum, n - 1);
		}

	}
}
