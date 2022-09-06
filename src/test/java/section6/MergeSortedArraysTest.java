package section6;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeSortedArraysTest {

	@Test
	public void mergeArraysTest() {
		int[] arrOne = { 2, 4, 6 };
		int[] arrTwo = { 1, 3, 5, 7, 8 };
		System.out.println(Arrays.toString(mergeArrays(arrOne, arrTwo)));
	}

	private int[] mergeArrays(int[] arrOne, int[] arrTwo) {

		int[] mergedArray = new int[arrOne.length + arrTwo.length];
		int m = 0;
		int i = 0;
		int j = 0;
		while (i < arrOne.length && j < arrTwo.length) {
			if (arrOne[i] < arrTwo[j]) {
				mergedArray[m] = arrOne[i];
				i++;
			} else {
				mergedArray[m] = arrTwo[j];
				j++;
			}
			m++;
		}

		while (i < arrOne.length) {
			mergedArray[m] = arrOne[i];
			i++;
			m++;
		}

		while (j < arrTwo.length) {
			mergedArray[m] = arrTwo[j];
			j++;
			m++;
		}

		return mergedArray;
	}

}
