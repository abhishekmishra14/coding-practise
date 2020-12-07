package codingpractise.algorithm.knapsackunbounded;

public class RodCutting {

	public int rodCut(int[] price, int length, int N) {
		int max = Integer.MIN_VALUE;
		if (price == null) {
			return 0;
		}
		if (length == 0) {
			return max;
		}

		max = Integer.max(rodCut(price, length - N, N), rodCut(price, length, N - 1));
		return max;
	}
}