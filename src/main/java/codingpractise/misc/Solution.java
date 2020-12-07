package codingpractise.misc;

public class Solution {

	public static void main(String[] args) {
		int[] inputArray = { 1, 3, 4 };
		System.out.println(getProduct(inputArray));
	}

	private static int getProduct(int[] inputArray) {
		int result = 1;
		for (int i = 0; i < inputArray.length; i++) {
			result = result * inputArray[i];
		}
		if (result < 0) {
			return 0;
		} else if (result > 0) {
			return 1;
		}
		return result;
	}
}
