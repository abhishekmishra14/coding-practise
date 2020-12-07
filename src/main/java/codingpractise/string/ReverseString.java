package codingpractise.string;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseStringIterative("Abhi"));
		System.out.println(reverseString.reverseStringRecurssion("Abhi"));
	}

	public String reverseStringIterative(String inputString) {
		String reveredString = "";
		if (inputString.isEmpty()) {
			return reveredString;
		}
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reveredString = reveredString + inputString.charAt(i);
		}
		return reveredString;
	}

	public String reverseStringRecurssion(String inputString) {
		String reversedString = "";
		if (inputString.isEmpty()) {
			return inputString;
		}
		return reverseStringRecurssion(inputString.substring(1)) + inputString.charAt(0);
	}
}
