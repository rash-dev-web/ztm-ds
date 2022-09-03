package section4;

import java.util.HashSet;

import org.testng.annotations.Test;

public class FindCommonElementTest {

	int[] array1 = { 1, 2, 3, 4, 5 };
	int[] array2 = { 9, 7, 8, 9, 0 };

	@Test
	public void findCommonElement() {

		System.out.println(commonElement(array1, array2));
	}

	@Test
	public void findElementHashSet() {
		System.out.println(commonElementHashSet(array1, array2));
	}

	private boolean commonElementHashSet(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length; j++) {
			if(hs.contains(arr2[j])) {
				return true;
			}
		}

		return false;
	}

	public boolean commonElement(int arr1[], int arr2[]) {
		boolean flag = false;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + " " + arr2[j]);
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
}
