package section4;

import org.testng.annotations.Test;

public class FindSumTest {

	@Test
	public void findSumInArray() {
		int[] arrOne = { 2, 9, 4, 5 };
		int[] arrTwo = { 2, 3, 4, 5 };
		int sum = 8;
		System.out.println(findSum(arrOne, sum)); // false
		System.out.println(findSum(arrTwo, sum)); // true 3 & 5
	}

	private boolean findSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int total = arr[i] + arr[j];
				if (total == sum) {
					System.out.println(arr[i] + " " + arr[j]);
					return true;
				}

			}

		}
		return false;
	}

}
