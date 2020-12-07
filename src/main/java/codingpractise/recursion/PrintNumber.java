package codingpractise.recursion;

public class PrintNumber {

	public void printNumber(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printNumber(n-1);
		//System.out.println(n);
	}
	
	public static void main(String[] args) {
		PrintNumber object = new PrintNumber();
		object.printNumber(10);
	}

}
