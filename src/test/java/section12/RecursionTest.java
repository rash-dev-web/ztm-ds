package section12;

import org.testng.annotations.Test;

public class RecursionTest {

	int counter = 0;
	int num = 2;
	int numOne = 0;
	int numTwo = 1;

	@Test
	public void returnFiboNumRecursion() {
		System.out.println(returnFiboNumRecur(num));
	}

	private int returnFiboNumRecur(int num) {
		if (num == 0 || num == 1) {
			return num;
		}

		return returnFiboNumRecur(num - 1) + returnFiboNumRecur(num - 2);
	}

	@Test
	public void returnFiboNum() {
		System.out.println(returnFibo(num));
	}

	private int returnFibo(int num) {
		int sum = 0;
		for (int i = 2; i <= num; i++) {
			sum = numOne + numTwo;
			numOne = numTwo;
			numTwo = sum;
		}
		return sum;
	}

	@Test
	public void printFibo() {
		printFiboSeries(num);
	}

	private void printFiboSeries(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.err.println(numOne);
			sum = numOne + numTwo;
			numOne = numTwo;
			numTwo = sum;
		}
	}

	@Test
	public void findFactorialIterative() {
		System.err.println(factorialIterative(num));
	}

	private int factorialIterative(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = i * fact;
		}
		return fact;
	}

	@Test
	public void findFactorialRecursion() {
		System.err.println(factorialRecursion(num));
	}

	private int factorialRecursion(int num) {
		if (num == 0 || num == 1) {
			return num;
		}
		return num * factorialRecursion(num - 1);
	}

	@Test
	public void baseRecursion() {
		System.err.println(recursion());
	}

	private String recursion() {
		System.err.println(counter);
		if (counter > 3) {
			return "Done!";
		}
		counter++;
		return recursion();
	}

}
