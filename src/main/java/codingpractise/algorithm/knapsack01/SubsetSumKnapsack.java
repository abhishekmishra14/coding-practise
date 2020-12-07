package codingpractise.algorithm.knapsack01;

import java.util.Arrays;

public class SubsetSumKnapsack {

	/**
	 * Solution for subset sum for a given input.
	 * 
	 * @param inputArray
	 * @param sum
	 * @return T/F
	 * 
	 */
	public boolean isSubsetSumSinglePointer(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = i + 1; j <= inputArray.length - 1; j++) {
				if (sum == inputArray[i] + inputArray[j]) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param inputArray
	 * @param sum
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public boolean isSubsetSumDoublePointer(int[] inputArray, int sum, int startIndex, int endIndex) {
		Arrays.sort(inputArray);

		while (startIndex < endIndex) {
			if (inputArray[startIndex] + inputArray[endIndex] < sum) {
				startIndex = startIndex + 1;
			} else if (inputArray[startIndex] + inputArray[endIndex] > sum) {
				endIndex = endIndex - 1;
			} else if (inputArray[startIndex] + inputArray[endIndex] == sum) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param inputArray
	 * @param sum
	 * @param n
	 * @return
	 */
	public boolean findSubsetSumRecursion(int[] inputArray, int sum, int n) {
		if (sum == 0) {
			return true;
		}
		if (n == 0 && sum != 0) {
			return false;
		}

		if (inputArray[n - 1] <= sum) {
			return findSubsetSumRecursion(inputArray, sum, n - 1)
					|| findSubsetSumRecursion(inputArray, sum - inputArray[n - 1], n - 1);
		} else {
			return findSubsetSumRecursion(inputArray, sum, n - 1);
		}
	}

	/**
	 * 
	 * @param inputArray
	 * @param sum
	 * @param n
	 * @return
	 */
	public boolean findSubsetSumRecursionMemoize(int[] inputArray, int sum, int n) {
		boolean[][] matrix = new boolean[n + 1][sum + 1];
		if (sum == 0) {
			return true;
		}
		if (n == 0 && sum != 0) {
			return false;
		}
		if (matrix[n][sum]) {
			return matrix[n][sum];
		}
		if (inputArray[n - 1] <= sum) {
			matrix[n][sum] = findSubsetSumRecursion(inputArray, sum, n - 1)
					|| findSubsetSumRecursion(inputArray, sum - inputArray[n - 1], n - 1);
		} else {
			matrix[n][sum] = findSubsetSumRecursion(inputArray, sum, n - 1);
		}
		return matrix[n][sum];
	}

	/**
	 * 
	 * @param inputArray
	 * @param sum
	 * @param n
	 * @return
	 */
	public boolean findSubsetSumDP(int[] inputArray, int sum, int n) {
		boolean[][] matrix = new boolean[n + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			matrix[i][0] = true;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; i <= sum; j++) {

				if (inputArray[i - 1] > j) {
					matrix[i][j] = matrix[i - 1][j];
				} else {
					matrix[i][j] = matrix[i - 1][j] || matrix[i - 1][j - inputArray[i - 1]];
				}
			}
		}
		return matrix[n][sum];
	}
}
