package section13;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortingTest {
	int[] arr = { 2, 45, 8, 1, 9, 3, 66, 3 };
	int temp;
	int min;

	@Test
	public void insertionSort() {
		int[] array = { 6, 5, 3, 1, 8, 7, 2, 4 };
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(array));
	}

	@Test
	public void selectionSort() {
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void bubbleSorting() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
