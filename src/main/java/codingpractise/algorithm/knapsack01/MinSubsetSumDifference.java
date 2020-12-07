package codingpractise.algorithm.knapsack01;

public class MinSubsetSumDifference {

	public int getMinSubsetSumDiff(int[] inputArray) {
		int minDiff = Integer.MAX_VALUE;
		if (inputArray == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}
		if (inputArray.length == 0) {
			return 0;
		}
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				int sum = inputArray[j];
				if (sum < minDiff) {

				}
			}
		}
		return minDiff;
	}
}
