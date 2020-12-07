package codingpractise.recursion;

public class Palindrome {

	public boolean isPalindrome(String inputString) {
		boolean isPalindrome = false;
		if (!inputString.isEmpty()) {
			String reverseString = reverseString(inputString);
			if (inputString.equalsIgnoreCase(reverseString)) {
				isPalindrome = true;
			}
		}
		return isPalindrome;
	}

	public boolean isPalindromeDoublePointer(String inputString) {
		boolean isPalindrome = true;
		int startIndx = 0;
		int endIndx = inputString.length() - 1;

		while (startIndx <= endIndx) {
			if (inputString.charAt(startIndx) == inputString.charAt(endIndx)) {
				startIndx++;
				endIndx--;
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	private String reverseString(String inputString) {
		String reverseString = "";

		if (inputString.isEmpty()) {
			return reverseString;
		}
		return reverseString(inputString.substring(1)) + inputString.charAt(0);
	}
}
