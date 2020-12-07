package codingpractise.recursion;

import jdk.internal.joptsimple.internal.Strings;

public class Permutation {

	@SuppressWarnings("restriction")
	public void findPermutation(String inputString) {
		/*
		 * if (inputString.isEmpty()) { return Strings.EMPTY; }
		 */
		permutations(Strings.EMPTY, inputString);
	}

	private String permutations1(String inputString, String result) {

		if (inputString.length() == 0) {
			return result + "|";
		} else {
			for (int i = 0; i < inputString.length(); i++) {
				result = permutations1(inputString.substring(0, i) + inputString.substring(i + 1),
						result + inputString.charAt(i));
			}
		}
		return result;
	}

	private static void permutations(String candidate, String remaining) {
		if (remaining.length() == 0) {
			System.out.println(candidate);
		}

		for (int i = 0; i < remaining.length(); i++) {
			String newCandidate = candidate + remaining.charAt(i);

			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

			permutations(newCandidate, newRemaining);
		}
	}
}
