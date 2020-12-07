package codingpractise.array;

import java.util.Arrays;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		DuplicateValueInArray duplicateValueInArray = new DuplicateValueInArray();
		Integer[] inputArray = new Integer[] { 4, 6, 9, 1, 44, 44 };
		duplicateValueInArray.findDuplicateInArray(inputArray);
	}

	private <E> void findDuplicateInArray(E[] inputArray) {
		Arrays.sort(inputArray);
		int i = 0;
		for (E e : inputArray) {
			if (inputArray[i] == inputArray[i + 1]) {
				System.out.println("Duplicate Value is : " + e);
				break;
			}
			i++;
		}
		printArray(inputArray);
	}

	private <E> void printArray(E[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

}
