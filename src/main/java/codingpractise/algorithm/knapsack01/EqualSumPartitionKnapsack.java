package codingpractise.algorithm.knapsack01;

public class EqualSumPartitionKnapsack {

	public boolean findEqualSumPartitionSubset(int[] inputArray, int sum) {
		boolean isEqualSumPartition = false;

		if (inputArray == null) {
			throw new IllegalArgumentException("Input invalid.");
		}
		if (sum == 0) {
			isEqualSumPartition = true;
			return isEqualSumPartition;
		}

		if (inputArray.length == 0 && sum == 0) {
			isEqualSumPartition = true;
			return isEqualSumPartition;
		}

		int totalSum = getSummation(inputArray);
		int remainder = isSummationEven(totalSum);

		if (remainder != 0) {
			isEqualSumPartition = false;
			return isEqualSumPartition;
		}

		isEqualSumPartition = findSubsetSum(inputArray, sum, inputArray.length);
		return isEqualSumPartition;
	}

	private boolean findSubsetSum(int[] inputArray, int sum, int n) {

		if (n == 0) {
			if (sum == 0) {
				return true;
			} else {
				return false;
			}
		}

		if (inputArray[n - 1] <= sum) {
			return findSubsetSum(inputArray, sum - inputArray[n - 1], n - 1) || findSubsetSum(inputArray, sum, n - 1);
		} else {
			return findSubsetSum(inputArray, sum, n - 1);
		}
	}

	private int isSummationEven(int totalSum) {
		return totalSum % 2;
	}

	private int getSummation(int[] inputArray) {
		int sum = 0;
		for (int i : inputArray) {
			sum = sum + i;
		}
		return sum;
	}
}
