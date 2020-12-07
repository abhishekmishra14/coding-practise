package codingpractise.algorithm.lcs;

import java.util.Arrays;

public class LongestCommonSeq {

	private int[][] t;

	public int getLCS(String str1, String str2) {

		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return 0;
		}

		return getLCSRecurrsive(str1, str2, str1.length(), str2.length());
	}

	private int getLCSRecurrsive(String str1, String str2, int str1Length, int str2Length) {

		if (str1Length == 0 || str2Length == 0) {
			return 0;
		}

		if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
			return 1 + getLCSRecurrsive(str1, str2, str1Length - 1, str2Length - 1);
		} else {
			return Integer.max(getLCSRecurrsive(str1, str2, str1Length - 1, str2Length),
					getLCSRecurrsive(str1, str2, str1Length, str2Length - 1));
		}
	}

	public int getLCSMemoize(String str1, String str2) {

		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return 0;
		}

		t = new int[str1.length() + 1][str2.length() + 1];
		for (int[] row : t) {
			Arrays.fill(row, -1);
		}
		return getLCSMemoizeRecurrsive(str1, str2, str1.length(), str2.length());
	}

	private int getLCSMemoizeRecurrsive(String str1, String str2, int str1Length, int str2Length) {

		if (str1Length == 0 || str2Length == 0) {
			return 0;
		}

		if (t[str1Length][str2Length] != -1) {
			return t[str1Length][str2Length];
		}

		if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
			t[str1Length][str2Length] = 1 + getLCSMemoizeRecurrsive(str1, str2, str1Length - 1, str2Length - 1);
		} else {
			t[str1Length][str2Length] = Integer.max(getLCSMemoizeRecurrsive(str1, str2, str1Length - 1, str2Length),
					getLCSMemoizeRecurrsive(str1, str2, str1Length, str2Length - 1));
		}
		return t[str1Length][str2Length];
	}

	public int getLCSTabulation(String str1, String str2) {

		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return 0;
		}

		t = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					t[i][j] = t[i - 1][j - 1] + 1;
				} else {
					t[i][j] = Integer.max(t[i - 1][j], t[i][j - 1]);
				}
			}
		}
		return t[str1.length()][str2.length()];
	}
	
	public String printLCS(String str1, String str2) {
		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return "";
		}
		
		t = new int[str1.length() + 1][str2.length() + 1];
		StringBuilder lcs = new StringBuilder();
		
		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					t[i][j] = t[i - 1][j - 1] + 1;
				} else {
					t[i][j] = Integer.max(t[i - 1][j], t[i][j - 1]);
				}
			}
		}
		
		int i = str1.length();
		int j = str2.length();
		
		while(i > 0 && j > 0) {
			if(str1.charAt(i-1) == str2.charAt(j-1)) {
				lcs.append(str1.charAt(i-1));
				i--;
				j--;
				
			}
			else {
				if(t[i-1][j] > t[i][j-1]) {
					i--;
				}
				else {
					j--;
				}
			}
		}
		return lcs.toString();
	}
}
