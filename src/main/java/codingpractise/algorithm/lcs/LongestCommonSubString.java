package codingpractise.algorithm.lcs;

import java.util.Arrays;

public class LongestCommonSubString {

	private int[][] t;

	public int getLCSS(String str1, String str2) {

		if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) {
			return 0;
		}
		return getLCSSRecurssive(str1, str2, str1.length(), str2.length());
	}

	private int getLCSSRecurssive(String str1, String str2, int str1Length, int str2Length) {

		if (str1Length == 0 || str2Length == 0) {
			return 0;
		}

		if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
			return getLCSSRecurssive(str1, str2, str1Length - 1, str2Length - 1) + 1;
		} else {
			return Math.min(0, Math.max(getLCSSRecurssive(str1, str2, str1Length - 1, str2Length),
					getLCSSRecurssive(str1, str2, str1Length, str2Length - 1)));
		}
	}

	public int getLCSSMemoiaze(String str1, String str2) {

		if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) {
			return 0;
		}

		t = new int[str1.length() + 1][str2.length() + 1];
		for (int[] row : t) {
			Arrays.fill(row, -1);
		}

		return getLCSSMemoizeRecurrsive(str1, str2, str1.length(), str2.length(), 0);
	}

	private int getLCSSMemoizeRecurrsive(String str1, String str2, int str1Length, int str2Length, int count) {

		if (str1Length == 0 || str2Length == 0) {
			return 0;
		}

		if (t[str1Length][str2Length] != -1) {
			return t[str1Length][str2Length];
		}

		if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
			t[str1Length][str2Length] = getLCSSMemoizeRecurrsive(str1, str2, str1Length - 1, str2Length - 1, count + 1);

		} else {
			t[str1Length][str2Length] = Math.max(count,
					Math.max(getLCSSMemoizeRecurrsive(str1, str2, str1Length - 1, str2Length, 0),
							getLCSSMemoizeRecurrsive(str1, str2, str1Length, str2Length - 1, 0)));
		}
		return t[str1Length][str2Length];
	}

	public int getLCSSTabulation(String str1, String str2) {
		if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) {
			return 0;
		}

		t = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					t[i][j] = t[i - 1][j - 1] + 1;
				} else {
					t[i][j] = 0;
				}
			}
		}
		return t[str1.length()][str2.length()];
	}

	public String printLCSS(String str1, String str2) {
		StringBuilder lcs = new StringBuilder();
		if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) {
			return "";
		}

		t = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					t[i][j] = t[i - 1][j - 1] + 1;
				} else {
					t[i][j] = 0;
				}
			}
		}

		int i = str1.length();
		int j = str2.length();

		while (i > 0 && j > 0) {
			if (str1.charAt(i-1) == str2.charAt(j-1)) {
				lcs.append(str1.charAt(i-1));
				i--;
				j--;
			}
			else {
				if(t[i-1][j] > t[i][j-1]) {
					j--;
				}
				else {
					i--;
				}
			}
		}
		
		return lcs.reverse().toString();
	}
}
