package codingpractise.recursion;

public class ReverseString {

	public String reverseStringRecursion(String inputString) {
		String reverseString = "";

		if (inputString.isEmpty()) {
			return reverseString;
		}
		return reverseStringRecursion(inputString.substring(1)) + inputString.charAt(0);
	}

	public String reverseStringIterative(String inputString) {
		String reverseString = "";
		if (!inputString.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (int i = inputString.length() - 1; i >= 0; i--) {
				sb.append(inputString.charAt(i));
			}
			return sb.toString();
		}
		return reverseString;
	}
}
