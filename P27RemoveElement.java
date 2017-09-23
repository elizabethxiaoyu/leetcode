import java.util.Arrays;

public class P27RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2,3,3, 4 };
		int count = removeElement(nums, 4);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				count = 0;
				while (i != nums.length && nums[i] == val) {
					count++;
					i++;
				}
				if (i == nums.length) {
					return nums.length - count;
				}
			}
			nums[i - count] = nums[i];
		}
		return nums.length - count;
	}
}
