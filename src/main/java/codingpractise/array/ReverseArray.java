package codingpractise.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] inputArray = { 1, 2, 3, 4, 5, 6 };
		reverseArray.printArray(inputArray);
		int[] outputArray = reverseArray.reverseArrayUsingAuxArray(inputArray);
		reverseArray.printArray(outputArray);

		reverseArray.printArrayGeneric(reverseArray.reverseArrayInPlaceGeneric(new Integer[] { 1, 2, 3, 4, 5, 6 }));
		reverseArray.printArrayGeneric(
				reverseArray.reverseArrayInPlaceGeneric(new String[] { "a", "b", "c", "d", "e", "f" }));
	}

	public int[] reverseArrayUsingAuxArray(int[] inputArray) {
		int[] reverseArray = new int[inputArray.length];
		int j = 0;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			reverseArray[j] = inputArray[i];
			j++;
		}
		return reverseArray;
	}

	public int[] reverseArrayInPlace(int[] inputArray) {
		int startIndex = 0;
		int endIndex = inputArray.length - 1;
		for (int i : inputArray) {
			if (startIndex >= endIndex) {
				break;
			}
			int temp = inputArray[startIndex];
			inputArray[startIndex] = inputArray[endIndex];
			inputArray[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		return inputArray;
	}

	public <E> E[] reverseArrayInPlaceGeneric(E[] inputArray) {
		int startIndex = 0;
		int endIndex = inputArray.length - 1;
		for (E i : inputArray) {
			if (startIndex >= endIndex) {
				break;
			}
			E temp = inputArray[startIndex];
			inputArray[startIndex] = inputArray[endIndex];
			inputArray[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		return inputArray;
	}

	public <E> void printArrayGeneric(E[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

	public void printArray(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

}
