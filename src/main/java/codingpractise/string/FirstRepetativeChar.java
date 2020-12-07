package codingpractise.string;

import java.util.Arrays;

public class FirstRepetativeChar {

	public static void main(String[] args) {
		FirstRepetativeChar firstRepetativeChar = new FirstRepetativeChar();
		// firstRepetativeChar.findFirstRepetativeChar1("abhishekk");
		// firstRepetativeChar.getMaxOccuringChar("abgdbcbsg");
		// firstRepetativeChar.isPalindrome("#abba");
		int[] intArray = new int[256];
		String s = "ab";
		intArray[0] = 1;
		intArray[s.charAt(0)] = s.charAt(0) + 1;
		intArray[2] = 'b';

		for (int i : intArray) {
			// System.out.print(i);
		}

		System.out.println(firstRepetativeChar.isAnagram("abhi", "hbia"));

		int[] intArray1 = { 'a', 4, 10, 77, 8, 'a' };

		for (int i = 1; i <= intArray1.length - 1; i++) {
			// System.out.println(intArray1[i-1]--);
		}

	}

	private void findFirstRepetativeChar(String inputString) {
		char[] charArray = inputString.toCharArray();
		outer: for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println("First Repetative Char: " + charArray[i]);
					break outer;
				}
			}
		}
	}

	private void findFirstRepetativeChar1(String inputString) {
		char[] charArray = inputString.toCharArray();
		int startIndx = 0;
		int endIndx = charArray.length - 1;
		Arrays.sort(charArray);

		int i = 0;
		for (char c : charArray) {
			if (i < charArray.length - 1 && charArray[i] == charArray[i + 1]) {
				System.out.println(charArray[i]);
				break;
			}
			i++;
		}
	}

	static char getMaxOccuringChar(String str) {
		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[256];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));
			count[str.charAt(i)]++;
		}

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		// System.out.println(result);
		return result;
	}

	public boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		s = s.toLowerCase();

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			while (i < j
					&& !((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
				i++;
			}

			while (i < j
					&& !((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				j--;
			}

			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;

		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.charAt(i)-'a');
			// System.out.println(t.charAt(i)-'a');
			// System.out.println(arr[s.charAt(i)-'a']++);
			// System.out.println(arr[t.charAt(i)-'a']--);
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}

		for (int i : arr) {
			if (i != 0)
				return false;
		}

		return true;
	}
}
