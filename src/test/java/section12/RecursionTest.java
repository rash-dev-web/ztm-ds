package section12;

import org.testng.annotations.Test;

public class RecursionTest {

	int counter = 0;
	int num = 5;
	
	@Test
	public void findFactorialIterative() {
		System.err.println(factorialIterative(num));
	}

	private int factorialIterative(int num) {
		int fact = 1;
		for(int i = num; i>0; i--) {
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
