package codingpractise.misc;

import java.util.HashSet;
import java.util.Set;

public class ConvertStringBasedOnValidDicWord {

	public static void main(String[] args) {
		String input = "Mynamejjisabhi";
		Set<String> dictionary = new HashSet();
		dictionary.add("My");
		dictionary.add("nam");
		dictionary.add("name");
		dictionary.add("is");
		dictionary.add("abhi");

		ConvertStringBasedOnValidDicWord obj = new ConvertStringBasedOnValidDicWord();
		obj.getValidDicWordFromInput1(input, dictionary);
	}

	public void getValidDicWordFromInput1(String input, Set<String> dictionary) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j <= input.length(); j++) {
				// String suffixKey = j;
				String key = input.substring(i, j);
				if (dictionary.contains(key)) {
					System.out.print(key + " ");

				}
			}
		}
	}

	public String segmentString1(String input, Set<String> dict) {
		if (dict.contains(input))
			return input;
		int len = input.length();
		for (int i = 1; i < len; i++) {
			String prefix = input.substring(0, i);
			if (dict.contains(prefix)) {
				String suffix = input.substring(i, len);
				String segSuffix = segmentString(suffix, dict);
				if (segSuffix != null) {
					return prefix + segSuffix;
				}
			}
		}
		return null;
	}

	String segmentString(String input, Set<String> dict) {
		if (dict.contains(input))
			return input;
		int len = input.length();
		for (int i = 1; i < len; i++) {
			String prefix = input.substring(0, i);
			if (dict.contains(prefix)) {
				String suffix = input.substring(i, len);
				String segSuffix = segmentString(suffix, dict);
				if (segSuffix != null) {
					return prefix + " " + segSuffix;
				}
			}
		}
		return null;
	}
}
