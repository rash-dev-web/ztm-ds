package section3;

import org.testng.annotations.Test;

public class FindNemoTest {
	
	final int[] boxes = {1,2,3,4,5,6};

	@Test(description = "complexity is O(n)")
	public void findNemo() throws InterruptedException {
		final String[] arr = { "nemo" };
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "nemo") {
				System.out.println("Found Nemo!");
			}
		}
		Thread.sleep(1000);
		long endTime = System.currentTimeMillis();
		System.out.println("Call to find nemo: " +( endTime - startTime));
	}
	
	@Test(description = "complexity is O(1)")
	public void logFirstTwoBoxes() {
		System.out.println(boxes[0]);
		System.out.println(boxes[1]);
		
	}
}
