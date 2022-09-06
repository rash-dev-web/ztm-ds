package section6;

import org.testng.annotations.Test;

public class TwoSumTest {

	@Test
	public void findTwoSum() {
		int[] nums = { 2, 7, 11, 15, 20 };
		int target = 27;

//		int[] result = findSum(nums, target);
//		System.out.println(result[0] + " " + result[1]);
		int[] result1 = findSumDS(nums, target);
		System.out.println(result1[0] + " " + result1[1]);
	}

	private int[] findSumDS(int[] nums, int target) {
		int[] indeces = new int[2];
		int[] diff = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			diff[i] = target - nums[i];
		}

		for (int i = 0; i < nums.length; i++)
			System.out.println(diff[i]);

		for (int i = 0; i < nums.length; i++) {

		}

		return indeces;
	}

	private int[] findSum(int[] nums, int target) {
		int[] indeces = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indeces[0] = i;
					indeces[1] = j;
				}
			}
		}
		return indeces;
	}

}
