package section13;

import java.util.Arrays;

import org.testng.annotations.Test;

public class InbuiltSortTest {

	@Test
	public void printSorting() {
		int[] arr = { 3, 2, 6, 5, 8, 1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
