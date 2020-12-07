package codingpractise.misc;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.getFib(7));
		fibonacci.getFib2(7);
	}

	public int getFib(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return getFib(number - 1) + getFib(number - 2);
	}

	public int getFib1(int number) {
		int fib1 = 1;
		int fib2 = 0;
		int fib = 0;

		if (number == 0) {
			return fib2;
		}
		if (number == 1) {
			return fib1;
		}

		for (int i = 2; i <= number; i++) {
			fib = fib1 + fib2;

			fib2 = fib1;
			fib1 = fib;

		}
		return fib;
	}

	public void getFib2(int number) {
		int[] fib = new int[number + 1];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= number; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		System.out.println(Arrays.toString(fib));
	}

}
