package codingpractise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElementArray {

	public static void main(String[] args) {
		List<Integer> inputData = new ArrayList<>();
		inputData.add(99);
		inputData.add(4);
		inputData.add(56);
		inputData.add(3);
		inputData.add(76);

		int[] intputArray = { 2, 88, 66, 32, 43 };
		insertInMiddle(intputArray, 2, 10);
		insertInMiddle1(inputData, 2, 10);
	}

	private static void insertInMiddle(int[] inputArray, int position, int value) {
		int[] outputArray = new int[inputArray.length + 1];
		for (int i = outputArray.length - 1; i >= 0; i--) {
			if (i == position) {
				outputArray[i] = value;
			} else if (i < position) {
				outputArray[i] = inputArray[i];
			} else if (i > position) {
				outputArray[i] = inputArray[i - 1];
			}

		}
		System.out.println(Arrays.toString(outputArray));
	}

	private static void insertInMiddle1(int[] inputArray, int position, int value) {
		int[] outputArray = new int[inputArray.length + 1];
		for (int i : inputArray) {
			if (i == position) {
				int oldValue = inputArray[i];
				inputArray[i] = value;
			}
		}

		System.out.println(Arrays.toString(outputArray));
	}

	private static void insertInMiddle1(List<Integer> inputList, int position, int value) {
		Integer[] inputArray = inputList.toArray(new Integer[0]);
		int[] outputArray = new int[inputList.size() + 1];

		for (int i = outputArray.length - 1; i >= 0; i--) {
			if (i == position) {
				outputArray[i] = value;
			} else if (i < position) {
				outputArray[i] = inputList.get(i);
			} else if (i > position) {
				outputArray[i] = inputList.get(i - 1);
			}

		}
		System.out.println(Arrays.toString(outputArray));
	}
}
