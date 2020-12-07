package codingpractise.misc;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringWordCount {

	public static void main(String[] args) {
		countWord("aaabbbbbccccdaa");
	}

	public static void countWord(String inputString) {
		Map<Character, Integer> map = new LinkedHashMap();
		if (!inputString.isEmpty()) {
			char[] cArray = inputString.toCharArray();
			for (char c : cArray) {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}
		}
		System.out.println(map);
	}
}
