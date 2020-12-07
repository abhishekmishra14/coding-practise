package codingpractise.recursion;

public class FactorialRecur {

	public static void main(String[] args) {
		System.out.println(getFact(3));
		System.out.println(getFact1(3));
	}

	private static int getFact(int inputNumber) {
		if (inputNumber == 0) {
			return 1;
		} else {
			return (inputNumber * getFact(inputNumber - 1));
		}
	}

	private static int getFact1(int inputNumber) {
		int fact = 1;
		for (int i = 1; i <= inputNumber; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
