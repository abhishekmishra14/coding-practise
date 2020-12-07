package codingpractise.string;

public class FirstMaxRepetativeChar {

	public static void main(String[] args) {
		findFirstMaxRepetative("AbAqAbbbbb");
	}

	public static void findFirstMaxRepetative(String inputChar) {
		char[] charArray = inputChar.toCharArray();

		int maxRepetation = 0;
		char maxOccurChar = '0';
		char outer = '0';
		for (int i = 0; i < charArray.length; i++) {
			int maxCount = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				outer = charArray[i];
				char inner = charArray[j];
				if (outer == inner) {
					++maxCount;
				}
			}
			if (maxRepetation < maxCount) {
				maxRepetation = maxCount;
				maxOccurChar = outer;
			}
		}

		System.out.println(maxRepetation + "" + maxOccurChar);
	}
}
