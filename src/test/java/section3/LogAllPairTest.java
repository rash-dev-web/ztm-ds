package section3;

import org.testng.annotations.Test;

public class LogAllPairTest {

	@Test
	public void logPair() {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					System.out.println(arr[i] +" "+ arr[j]);
				}
			}
		}
	}

}
