package section4;

import org.testng.annotations.Test;

public class FindCommonElementTest {

	int[] array1 = { 1, 2, 3, 4, 5 };
	int[] array2 = { 5, 7, 8, 9, 0 };

	@Test
	public void findCommonElement() {

		System.out.println(commonElement(array1, array2));
	}

	public boolean commonElement(int arr1[], int arr2[]) {
		System.out.println("array 1 lenght: " + arr1.length);
		System.out.println("array 2 lenght: " + arr2.length);
		boolean flag = false;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + " "+ arr2[j]);
					flag =  true;
					break;
				}
			}
		}
		return flag;
	}
}
