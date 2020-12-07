package codingpractise.array;

import java.util.Arrays;

public class FindIndexOfArrayForGivenInput {

	public static void main(String[] args) {
		FindIndexOfArrayForGivenInput findIndexOfArrayForGivenInput = new FindIndexOfArrayForGivenInput();
		Integer[] inputArray = { 1, 2, 3, 4, 5, 6 };
		Integer[] sumOFTwoIndex = new Integer[2];
		findIndexOfArrayForGivenInput.findSumOfIndexArrayGivenInput(inputArray, sumOFTwoIndex, 11);
		findIndexOfArrayForGivenInput.findSumOfIndexArrayGivenInput1(inputArray, sumOFTwoIndex, 11);
		// findIndexOfArrayForGivenInput.printArray(inputArray);
	}

	private Integer[] findSumOfIndexArrayGivenInput(Integer[] inputArray, Integer[] sumOFTwoIndex, int inputValue) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = i + 1; j <= inputArray.length - 1; j++) {
				int sum = inputArray[i] + inputArray[j];
				if (sum == inputValue) {
					sumOFTwoIndex[0] = i;
					sumOFTwoIndex[1] = j;
					break;
				}
			}
		}
		printArray(sumOFTwoIndex);
		return sumOFTwoIndex;
	}

	private Integer[] findSumOfIndexArrayGivenInput1(Integer[] inputArray, Integer[] sumOFTwoIndex, int inputValue) {
		int startIndex = 0;
		int endIndex = inputArray.length - 1;
		Arrays.sort(inputArray);

		for (int i : inputArray) {
			if (startIndex >= endIndex) {
				break;
			}
			int sum = inputArray[i] + inputArray[i + 1];

			if (sum == inputValue) {
				sumOFTwoIndex[0] = i;
				sumOFTwoIndex[1] = i + 1;
				break;
			} else if (sum < inputValue) {
				startIndex++;
			} else if (sum > inputValue) {
				endIndex--;
			}
		}
		printArray(sumOFTwoIndex);
		return sumOFTwoIndex;
	}

	public <E> void printArray(E[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

}
