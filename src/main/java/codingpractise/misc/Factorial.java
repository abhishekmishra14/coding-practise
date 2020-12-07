package codingpractise.misc;

public class Factorial {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.getFact(4));
	}

	public int getFact(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return number * getFact(number - 1);
	}
}
